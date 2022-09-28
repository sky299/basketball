package com.app.controller;

import com.app.service.WxUserStudentService;
import com.app.vo.JsonResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jckj.model.TRUserStudent;
import com.jckj.model.TStudentInfo;
import com.jckj.util.JedisUtils;
import com.jckj.util.SequenceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;

import java.util.UUID;

@RestController
@RequestMapping("wx/user")
public class WxUserController {

    @Autowired
    private WxUserStudentService wxUserStudentService;

    @Autowired
    private JedisUtils jedis;

    @RequestMapping("code")
    public String createCode(TStudentInfo tStudentInfo) {
        String token = UUID.randomUUID().toString();
        Gson gson = new GsonBuilder().create();
        Jedis jedis = this.jedis.getJedis();
        jedis.setex(token, 300, gson.toJson(tStudentInfo));
        this.jedis.close(jedis);
        return "http://localhost:8888/studentBind?token=" + token;
    }

    @RequestMapping("studentBind")
    public JsonResult studentBind(String token,String userPhone) {
        TRUserStudent trUserStudent = new TRUserStudent();
        Jedis jedis = this.jedis.getJedis();
        Gson gson = new GsonBuilder().create();
        TStudentInfo tStudentInfo = gson.fromJson(jedis.get(token), TStudentInfo.class);

        trUserStudent.setRid(SequenceUtil.nextId());
        trUserStudent.setStudentId(tStudentInfo.getStudentId());
        trUserStudent.setUserPhone(userPhone);
        trUserStudent.setRelation("家长");

        wxUserStudentService.insert(trUserStudent);
        this.jedis.close(jedis);
        return JsonResult.success();
    }
}

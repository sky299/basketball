package com.jckj.controller;

import com.jckj.util.QiniuFile;
import com.jckj.model.TUserInfo;
import com.jckj.service.UserService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("page/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public JsonResult list(TUserInfo tUserInfo) {
        return JsonResult.success(userService.list(tUserInfo).getList(), userService.count(tUserInfo));
    }

    @PostMapping("remove")
    public JsonResult remove(Integer id) {
        userService.remove(id);
        return JsonResult.success();
    }

    @PostMapping("update")
    public JsonResult update(TUserInfo tUserInfo, @RequestParam(value = "photo", required = false) MultipartFile photo) throws IOException {
        if (null != photo) {
            tUserInfo.setUserPhoto(QiniuFile.loadFile(photo.getBytes()));
        }else {
            TUserInfo userInfo = userService.info(tUserInfo.getId());
            tUserInfo.setUserPhoto(userInfo.getUserPhoto());
        }
        userService.update(tUserInfo);
        return JsonResult.success();
    }

    @PostMapping("add")
    public JsonResult add(TUserInfo tUserInfo, @RequestParam("photo") MultipartFile photo) throws IOException {
        tUserInfo.setUserPhoto(QiniuFile.loadFile(photo.getBytes()));
        userService.add(tUserInfo);
        return JsonResult.success();
    }

    @PostMapping("bathDelete")
    public JsonResult bathDelete(String id) {
        String[] split = id.split(",");
        for (String s : split) {
            userService.remove(Integer.parseInt(s));
        }
        return JsonResult.success();
    }
}

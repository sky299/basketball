package com.jckj.service.impl;

import com.jckj.mapper.OpenIntegralMapper;
import com.jckj.model.CourseInfo;
import com.jckj.model.OpenIntegral;
import com.jckj.service.OpenIntegralService;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/2 0:38
 * @describe:
 */
@Service
public class OpenIntegralServiceImpl implements OpenIntegralService {

    @Autowired
    private OpenIntegralMapper openIntegralMapper;
    @Override
    public PageVo list(OpenIntegral openIntegral) {
        List<OpenIntegral> listCourseInfo = openIntegralMapper.findAll(openIntegral);
        return PageVo.successPage(listCourseInfo);
    }

    @Override
    public OpenIntegral findById(OpenIntegral openIntegral) {
        return openIntegralMapper.findById(openIntegral);
    }

    @Override
    public int count() {
        return openIntegralMapper.count();
    }

    @Override
    public int add(OpenIntegral openIntegral) {
        Date date = new Date();
        long time = date.getTime();
        openIntegral.setCreateTime(time);
        openIntegral.setUpdateTime(time);
        return openIntegralMapper.add(openIntegral);
    }

    @Override
    public int delete(String id) {
        String[] split = id.split(",");
        int delete = 0;
        for (String s : split) {
            OpenIntegral openIntegral = new OpenIntegral();
            openIntegral.setId(Integer.parseInt(s));
            Date date = new Date();
            long time = date.getTime();
            openIntegral.setUpdateTime(time);
            delete += openIntegralMapper.delete(openIntegral);
        }
        return delete;
    }

    @Override
    public int update(OpenIntegral openIntegral) {
        Date date = new Date();
        long time = date.getTime();
        openIntegral.setUpdateTime(time);
        return openIntegralMapper.update(openIntegral);
    }
}

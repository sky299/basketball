package com.jckj.service.impl;

import com.jckj.mapper.OpenProblemMapper;
import com.jckj.model.OpenIntegral;
import com.jckj.model.OpenProblem;
import com.jckj.service.OpenProblemService;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/2 1:29
 * @describe:
 */
@Service
public class OpenProblemServiceImpl implements OpenProblemService {

    @Autowired
    private OpenProblemMapper openProblemMapper;

    @Override
    public PageVo list(OpenProblem openProblem) {
        List<OpenProblem> listCourseInfo = openProblemMapper.findAll(openProblem);
        return PageVo.successPage(listCourseInfo);
    }

    @Override
    public OpenProblem findById(OpenProblem openProblem) {
        return openProblemMapper.findById(openProblem);
    }

    @Override
    public int count() {
        return openProblemMapper.count();
    }

    @Override
    public int add(OpenProblem openProblem) {
        Date date = new Date();
        long time = date.getTime();
        openProblem.setCreateTime(time);
        openProblem.setUpdateTime(time);
        return openProblemMapper.add(openProblem);
    }

    @Override
    public int delete(String id) {
        String[] split = id.split(",");
        int delete = 0;
        for (String s : split) {
            OpenProblem openProblem = new OpenProblem();
            openProblem.setId(Integer.parseInt(s));
            Date date = new Date();
            long time = date.getTime();
            openProblem.setUpdateTime(time);
            delete += openProblemMapper.delete(openProblem);
        }
        return delete;
    }

    @Override
    public int update(OpenProblem openProblem) {
        Date date = new Date();
        long time = date.getTime();
        openProblem.setUpdateTime(time);
        return openProblemMapper.update(openProblem);
    }
}

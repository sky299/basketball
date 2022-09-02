package com.jckj.service.impl;

import com.jckj.mapper.OpenAnswerMapper;
import com.jckj.model.OpenAnswer;
import com.jckj.service.OpenAnswerService;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/2 10:04
 * @describe:
 */
@Service
public class OpenAnswerServiceImpl implements OpenAnswerService {

    @Autowired
    private OpenAnswerMapper openAnswerMapper;

    @Override
    public PageVo find(OpenAnswer openAnswer) {
        List<OpenAnswer> answer = openAnswerMapper.find(openAnswer);
        return PageVo.successPage(answer);
    }

    @Override
    public Integer add(OpenAnswer openAnswer) {
        Date date = new Date();
        long time = date.getTime();
        openAnswer.setCreateTime(time);
        openAnswer.setUpdateTime(time);
        return openAnswerMapper.add(openAnswer);
    }

    @Override
    public Integer update(OpenAnswer openAnswer) {
        Date date = new Date();
        long time = date.getTime();
        openAnswer.setUpdateTime(time);
        return openAnswerMapper.update(openAnswer);
    }

    @Override
    public Integer delete(OpenAnswer openAnswer) {
        Date date = new Date();
        long time = date.getTime();
        openAnswer.setUpdateTime(time);
        return openAnswerMapper.delete(openAnswer);
    }
}

package com.app.service.impl;

import com.jckj.dto.PageDto;
import com.app.mapper.WxStudentMapper;
import com.app.service.WxStudentService;
import com.app.vo.PageVo;
import com.jckj.model.TStudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WxStudentServiceImpl implements WxStudentService {

    @Autowired
    private WxStudentMapper wxStudentMapper;

    @Override
    public PageVo list(PageDto pageDto) {
        return PageVo.successPage(wxStudentMapper.list(pageDto));
    }

    @Override
    public Integer count(PageDto pageDto) {
        return wxStudentMapper.count(pageDto);
    }

    @Override
    public TStudentInfo info(String studentId) {
        return wxStudentMapper.info(studentId);
    }

    @Override
    public void update(TStudentInfo tStudentInfo) {
        tStudentInfo.setUpdateTime(System.currentTimeMillis());
        wxStudentMapper.update(tStudentInfo);
    }
}

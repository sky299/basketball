package com.app.service.impl;

import com.app.mapper.WxStudentMapper;
import com.app.mapper.WxUserStudentMapper;
import com.app.service.WxUserStudentService;
import com.jckj.model.TRUserStudent;
import com.jckj.model.TStudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WxUserStudentServiceImpl implements WxUserStudentService {

    @Autowired
    private WxUserStudentMapper wxUserStudentMapper;

    @Autowired
    private WxStudentMapper wxStudentMapper;

    @Override
    public TStudentInfo findByUserPhone(String userPhone) {
        TRUserStudent trUserStudent = wxUserStudentMapper.findByUserPhone(userPhone);
        return wxStudentMapper.info(trUserStudent.getStudentId());
    }
}

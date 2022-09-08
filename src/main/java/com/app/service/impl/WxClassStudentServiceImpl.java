package com.app.service.impl;

import com.app.mapper.WxClassStudentMapper;
import com.app.service.WxClassStudentService;
import com.jckj.model.TRClassStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WxClassStudentServiceImpl implements WxClassStudentService {

    @Autowired
    private WxClassStudentMapper wxClassStudentMapper;

    @Override
    public TRClassStudent infoByStudentId(Integer studentId) {
        return wxClassStudentMapper.infoByStudentId(studentId);
    }

    @Override
    public void update(TRClassStudent trClassStudent) {
        trClassStudent.setUpdateTime(System.currentTimeMillis());
        wxClassStudentMapper.update(trClassStudent);
    }
}

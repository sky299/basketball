package com.app.support;

import com.app.mapper.WxClassStudentMapper;
import com.app.mapper.WxStudentMapper;
import com.jckj.model.TRClassStudent;
import com.jckj.model.TStudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WxStudentSupport {

    @Autowired
    private WxStudentMapper wxStudentMapper;

    @Autowired
    private WxClassStudentMapper wxClassStudentMapper;

    public String getStudentName(Integer studentId) {
        TStudentInfo tStudentInfo = wxStudentMapper.info(studentId);
        return tStudentInfo.getStudentName();
    }

    public void addStudentCourseNum(Integer studentId) {
        TRClassStudent trClassStudent = wxClassStudentMapper.infoByStudentId(studentId);
        trClassStudent.setStudentCourseNum(trClassStudent.getStudentCourseNum() + 1);
        trClassStudent.setUpdateTime(System.currentTimeMillis());
        wxClassStudentMapper.update(trClassStudent);
    }
}

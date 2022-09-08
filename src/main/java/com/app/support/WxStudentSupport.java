package com.app.support;

import com.app.service.WxClassStudentService;
import com.app.service.WxStudentService;
import com.jckj.model.TRClassStudent;
import com.jckj.model.TStudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WxStudentSupport {

    @Autowired
    private WxStudentService wxStudentService;

    @Autowired
    private WxClassStudentService wxClassStudentService;

    public String getStudentName(Integer studentId) {
        TStudentInfo tStudentInfo = wxStudentService.info(studentId);
        return tStudentInfo.getStudentName();
    }

    public void addStudentCourseNum(Integer studentId) {
        TRClassStudent trClassStudent = wxClassStudentService.infoByStudentId(studentId);
        trClassStudent.setStudentCourseNum(trClassStudent.getStudentCourseNum() + 1);
        wxClassStudentService.update(trClassStudent);
    }
}

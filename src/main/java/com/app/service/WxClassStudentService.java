package com.app.service;

import com.jckj.model.TRClassStudent;

public interface WxClassStudentService {
    TRClassStudent infoByStudentId(Integer studentId);

    void update(TRClassStudent trClassStudent);
}

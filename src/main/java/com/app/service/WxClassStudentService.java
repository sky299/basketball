package com.app.service;

import com.jckj.model.TRClassStudent;

public interface WxClassStudentService {
    TRClassStudent findByStudentId(String studentId);

    void update(TRClassStudent trClassStudent);
}

package com.app.mapper;

import com.jckj.model.TRClassStudent;
import org.springframework.stereotype.Repository;

@Repository
public interface WxClassStudentMapper {

    TRClassStudent infoByStudentId(Integer studentId);

    void update(TRClassStudent trClassStudent);
}

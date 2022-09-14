package com.app.mapper;

import com.jckj.model.TRClassStudent;
import org.springframework.stereotype.Repository;

@Repository
public interface WxClassStudentMapper {

    TRClassStudent findByStudentId(String studentId);

    void update(TRClassStudent trClassStudent);
}

package com.app.mapper;

import com.jckj.model.TRUserStudent;
import org.springframework.stereotype.Repository;

@Repository
public interface WxUserStudentMapper {

    TRUserStudent findByUserPhone(String phone);
}

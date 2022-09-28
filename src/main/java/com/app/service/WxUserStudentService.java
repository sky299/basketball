package com.app.service;

import com.jckj.model.TRUserStudent;
import com.jckj.model.TStudentInfo;

public interface WxUserStudentService {

    TStudentInfo findByUserPhone(String userPhone);

    void insert(TRUserStudent trUserStudent);
}

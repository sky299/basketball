package com.app.service;

import com.jckj.model.TStudentInfo;

public interface WxUserStudentService {

    TStudentInfo findByUserPhone(String userPhone);
}

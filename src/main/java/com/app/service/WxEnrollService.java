package com.app.service;

import com.app.vo.PageVo;
import com.jckj.model.Enroll;
import com.jckj.model.TOrderInfo;

public interface WxEnrollService {

    PageVo list(Enroll enroll);

    void insert(Enroll enroll);

    TOrderInfo signUp(Enroll enroll);
}

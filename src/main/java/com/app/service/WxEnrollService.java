package com.app.service;

import com.app.vo.PageVo;
import com.jckj.model.Enroll;

public interface WxEnrollService {

    PageVo list(Enroll enroll);

    void insert(Enroll enroll);
}

package com.app.service;

import com.jckj.dto.PageDto;
import com.app.vo.PageVo;
import com.jckj.model.TStudentInfo;

public interface WxStudentService {

    PageVo list(PageDto pageDto);

    Integer count(PageDto pageDto);

    TStudentInfo info(String studentId);

    void update(TStudentInfo tStudentInfo);
}

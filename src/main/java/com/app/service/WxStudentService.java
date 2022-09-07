package com.app.service;

import com.jckj.dto.PageDto;
import com.app.vo.PageVo;

public interface WxStudentService {

    PageVo list(PageDto pageDto);

    Integer count(PageDto pageDto);
}

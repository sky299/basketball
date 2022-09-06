package com.jckj.service;

import com.jckj.dto.PageDto;
import com.jckj.vo.PageVo;

public interface OrderService {
    /**
     * 列表
     */
    PageVo list(PageDto dto);

    /**
     * 列表总数
     */
    Integer count(PageDto pageDto);

}

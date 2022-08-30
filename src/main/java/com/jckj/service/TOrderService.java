package com.jckj.service;

import com.jckj.dto.PageDto;
import com.jckj.model.TOrderInfo;

import java.util.List;

public interface TOrderService {
    /**
     * 列表
     */
    List<TOrderInfo> list(PageDto dto);

    /**
     * 列表总数
     */
    Integer count(PageDto pageDto);

    /**
     * 详情
     */
    TOrderInfo info(Integer id);

    /**
     * 新增
     */
    void add(TOrderInfo tOrderInfo);

    /**
     * 修改
     */
    void update(TOrderInfo tOrderInfo);

    /**
     * 删除
     */
    void remove(Integer id);

}

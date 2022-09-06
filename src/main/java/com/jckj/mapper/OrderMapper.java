package com.jckj.mapper;

import com.jckj.dto.PageDto;
import com.jckj.model.TOrderInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper {
    /**
     * 列表
     */
    List<TOrderInfo> list(PageDto dto);

    /**
     * 列表总数
     */
    Integer count(PageDto pageDto);
}

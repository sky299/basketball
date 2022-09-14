package com.app.mapper;

import com.jckj.model.TOrderInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface WxOrderMapper {
    void insert(TOrderInfo tOrderInfo);
}

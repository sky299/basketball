package com.jckj.service.impl;

import com.jckj.dto.PageDto;
import com.jckj.mapper.OrderMapper;
import com.jckj.model.TOrderInfo;
import com.jckj.service.TOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TOrderServiceImpl implements TOrderService {

    @Autowired
    private OrderMapper orderMapper;


    @Override
    public List<TOrderInfo> list(PageDto dto) {
        return null;
    }

    @Override
    public Integer count(PageDto pageDto) {
        return null;
    }

    @Override
    public TOrderInfo info(Integer id) {
        return null;
    }

    @Override
    public void add(TOrderInfo tOrderInfo) {

    }

    @Override
    public void update(TOrderInfo tOrderInfo) {

    }

    @Override
    public void remove(Integer id) {

    }
}

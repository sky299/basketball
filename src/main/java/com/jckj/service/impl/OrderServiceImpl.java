package com.jckj.service.impl;

import com.jckj.dto.PageDto;
import com.jckj.mapper.OrderMapper;
import com.jckj.model.TOrderInfo;
import com.jckj.service.OrderService;
import com.jckj.util.SequenceUtil;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;


    @Override
    public PageVo list(PageDto dto) {
        return PageVo.successPage(orderMapper.list(dto));
    }

    @Override
    public Integer count(PageDto pageDto) {
        return orderMapper.count(pageDto);
    }
}

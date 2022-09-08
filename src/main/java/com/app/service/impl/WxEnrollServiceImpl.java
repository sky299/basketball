package com.app.service.impl;

import com.app.mapper.WxEnrollMapper;
import com.app.service.WxEnrollService;
import com.app.vo.PageVo;
import com.jckj.model.Enroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WxEnrollServiceImpl implements WxEnrollService {

    @Autowired
    private WxEnrollMapper wxEnrollMapper;

    @Override
    public PageVo list(Enroll enroll) {
        return PageVo.successPage(wxEnrollMapper.list(enroll));
    }

    @Override
    public void insert(Enroll enroll) {
        enroll.setCreateTime(System.currentTimeMillis());
        enroll.setUpdateTime(System.currentTimeMillis());
        wxEnrollMapper.insert(enroll);
    }
}

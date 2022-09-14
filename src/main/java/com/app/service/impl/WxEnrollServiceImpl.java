package com.app.service.impl;

import com.app.mapper.WxEnrollMapper;
import com.app.mapper.WxOrderMapper;
import com.app.service.WxEnrollService;
import com.app.vo.PageVo;
import com.jckj.model.Enroll;
import com.jckj.model.TOrderInfo;
import com.jckj.util.SequenceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WxEnrollServiceImpl implements WxEnrollService {

    @Autowired
    private WxEnrollMapper wxEnrollMapper;

    @Autowired
    private WxOrderMapper wxOrderMapper;

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

    @Override
    public TOrderInfo signUp(Enroll enroll) {
        TOrderInfo tOrderInfo = new TOrderInfo();
        tOrderInfo.setOrderId(SequenceUtil.nextId());
        tOrderInfo.setUserPhone(enroll.getUserPhone());
        tOrderInfo.setSchoolName(enroll.getSchoolName());
        tOrderInfo.setStudentName(enroll.getStudentName());
        tOrderInfo.setEnrollId(enroll.getId());
        tOrderInfo.setCreateTime(System.currentTimeMillis());
        tOrderInfo.setUpdateTime(System.currentTimeMillis());
        wxOrderMapper.insert(tOrderInfo);
        wxEnrollMapper.insert(enroll);
        return tOrderInfo;
    }
}

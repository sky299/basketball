package com.app.service.impl;

import com.app.mapper.WxEnrollMapper;
import com.app.mapper.WxOrderMapper;
import com.app.mapper.WxStudentMapper;
import com.app.service.WxEnrollService;
import com.app.vo.PageVo;
import com.jckj.model.Enroll;
import com.jckj.model.TOrderInfo;
import com.jckj.model.TStudentInfo;
import com.jckj.util.SequenceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class WxEnrollServiceImpl implements WxEnrollService {

    @Autowired
    private WxEnrollMapper wxEnrollMapper;

    @Autowired
    private WxOrderMapper wxOrderMapper;

    @Autowired
    private WxStudentMapper wxStudentMapper;

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
        TStudentInfo tStudentInfo = wxStudentMapper.findByStudentNameAndStudentSchool(enroll.getSchoolName(), enroll.getSchoolName());
        if (tStudentInfo == null){
            TStudentInfo tStudentInfo1 = new TStudentInfo();
            tStudentInfo1.setStudentId(SequenceUtil.nextId());
            tStudentInfo1.setStudentName(enroll.getStudentName());
            tStudentInfo1.setStudentSchool(enroll.getSchoolName());
            tStudentInfo1.setStudentStatus(0);
            tStudentInfo1.setCreateTime(System.currentTimeMillis());
            tStudentInfo1.setUpdateTime(System.currentTimeMillis());
            wxStudentMapper.insert(tStudentInfo1);
        }

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

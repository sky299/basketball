package com.jckj.service.impl;

import com.jckj.mapper.SaltsMapper;
import com.jckj.model.SaltsInfo;
import com.jckj.model.TStudentInfo;
import com.jckj.service.SaltsService;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/1 11:06
 * @describe:
 */
@Service
public class SaltsServiceImpl implements SaltsService {

    @Autowired
    private SaltsMapper saltsMapper;

    @Override
    public PageVo list(SaltsInfo saltsInfo) {
        List<SaltsInfo> list = saltsMapper.findAll(saltsInfo);
        return PageVo.successPage(list);
    }

    @Override
    public int count(SaltsInfo saltsInfo) {
        return saltsMapper.count(saltsInfo);
    }
}

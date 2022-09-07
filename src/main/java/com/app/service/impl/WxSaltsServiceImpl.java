package com.app.service.impl;

import com.app.mapper.WxSaltsMapper;
import com.app.service.WxSaltsService;
import com.jckj.model.SaltsInfo;
import com.jckj.vo.PageVo;
import com.sun.xml.internal.bind.v2.TODO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author 小江
 * @date 2022/9/6 16:55
 * @describe:
 */
@Service
public class WxSaltsServiceImpl implements WxSaltsService {
    @Resource
    private WxSaltsMapper appCourseInfoMapper;

    @Override
    public PageVo list(SaltsInfo saltsInfo) {
        List<SaltsInfo> list = appCourseInfoMapper.findAll(saltsInfo);
        return PageVo.successPage(list);
    }

    @Override
    public int addSalts(SaltsInfo saltsInfo) {
        Date date = new Date();
        long time = date.getTime();
        saltsInfo.setCreateTime(time);
        saltsInfo.setUpdateTime(time);
        // TODO: student-学生课时加课
        // TODO: student-学生课时减一
        if (saltsInfo.getSaltsType()){

        }else {

        }
        return appCourseInfoMapper.addSalts(saltsInfo);
    }
}

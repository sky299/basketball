package com.app.service.impl;

import com.app.mapper.WxSaltsMapper;
import com.app.service.WxSaltsService;
import com.jckj.model.SaltsInfo;
import com.jckj.vo.PageVo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author 小江
 * @date 2022/9/6 16:55
 * @describe:
 */
@Service
@Transactional
public class WxSaltsServiceImpl implements WxSaltsService {

    @Resource
    private WxSaltsMapper wxCourseInfoMapper;

    @Override
    public PageVo list(SaltsInfo saltsInfo) {
        List<SaltsInfo> list = wxCourseInfoMapper.findAll(saltsInfo);
        return PageVo.successPage(list);
    }

    @Override
    public int addSalts(SaltsInfo saltsInfo) {
        Date date = new Date();
        long time = date.getTime();
        saltsInfo.setCreateTime(time);
        saltsInfo.setUpdateTime(time);
        saltsInfo.setSaltsName("小明");
        saltsInfo.setSaltsTime(time);
        saltsInfo.setSaltsCause("误课加课");
        saltsInfo.setSaltsType(false);
        saltsInfo.setSaltsName(saltsInfo.getSaltsName());
        // TODO: student-学生课时加课
        return wxCourseInfoMapper.addSalts(saltsInfo);
    }

    @Override
    public int cutSalts(SaltsInfo saltsInfo, String ids) {
        Date date = new Date();
        long time = date.getTime();
        String[] split = ids.split(",");
        int i = 0;
        for (String s : split) {
            // TODO: student-学生课时 param 学员id return 学员课时剩余数量
            int studentCount = 10;
            if (studentCount != 0) {
                SaltsInfo salts = new SaltsInfo();
                // TODO：student-学员姓名(param 学员id return 学员姓名)
                salts.setStudentName("tStudentInfo.getStudentName()");
                salts.setSaltsTime(time);
                salts.setSaltsCause("正常销课");
                salts.setSaltsType(true);
                salts.setSaltsName(saltsInfo.getSaltsName());
                salts.setStudentId(Integer.parseInt(s));
                salts.setCreateTime(time);
                salts.setUpdateTime(time);
                i += wxCourseInfoMapper.addSalts(salts);
                // TODO: student-学生课时减一 param 学员id return 学员课时数量减一
            }
        }
        return i;
    }
}

package com.app.service.impl;

import com.app.mapper.WxSaltsMapper;
import com.app.service.WxSaltsService;
import com.app.support.WxStudentSupport;
import com.jckj.model.Mien;
import com.jckj.model.SaltsInfo;
import com.jckj.vo.PageVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author 小江
 * @date 2022/9/6 16:55
 * @describe:
 */
@Service
public class WxSaltsServiceImpl implements WxSaltsService {

    String today = "today";
    String week = "week";

    @Resource
    private WxSaltsMapper wxCourseInfoMapper;
    @Resource
    private WxStudentSupport wxStudentSupport;

    @Override
    public PageVo list(SaltsInfo saltsInfo,String da) {
        Calendar calendar = Calendar.getInstance();
        List<SaltsInfo> list = null;
        if (da.equals(today)){
            calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)-1,23,59,59);
            long tt = calendar.getTime().getTime();
            saltsInfo.setSaltsTime(tt);
            list = wxCourseInfoMapper.findAll(saltsInfo);
        }else {
            if (da.equals(week)){
                calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONDAY), calendar.get(Calendar.DAY_OF_MONTH), 23, 59,59);
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
                calendar.add(Calendar.DATE,-1);
                long time = calendar.getTime().getTime();
                saltsInfo.setSaltsTime(time);
                list = wxCourseInfoMapper.findAll(saltsInfo);
            }else {
                list = wxCourseInfoMapper.findAll(saltsInfo);
            }
        }
        return PageVo.successPage(list);
    }

    @Override
    public int addSalts(SaltsInfo saltsInfo) {
        Date date = new Date();
        long time = date.getTime();
        saltsInfo.setCreateTime(time);
        saltsInfo.setUpdateTime(time);
        // TODO：student-学员姓名(param 学员id return 学员姓名)
        String studentName = wxStudentSupport.getStudentName(saltsInfo.getStudentId());
        saltsInfo.setStudentName(studentName);
        saltsInfo.setSaltsTime(time);
        saltsInfo.setSaltsCause("误课加课");
        saltsInfo.setSaltsType(false);
        saltsInfo.setSaltsName(saltsInfo.getSaltsName());
        // TODO: student-学生课时加课
        wxStudentSupport.addStudentCourseNum(saltsInfo.getStudentId());
        int insert = wxCourseInfoMapper.addSalts(saltsInfo);
        if (insert == 1){
//            redisUtil.set(saltsInfo.getId()+"saltsInfo",saltsInfo);
        }
        return insert;
    }

    @Override
    public int cutSalts(SaltsInfo saltsInfo, String ids) {
        String[] split = ids.split(",");
        return Arrays.stream(split).filter(s -> {
            Integer studentCourseNum = wxStudentSupport.getStudentCourseNum(s);
            return studentCourseNum != 0;
        }).mapToInt((s) ->{
            SaltsInfo salts = new SaltsInfo();
            // TODO：student-学员姓名(param 学员id return 学员姓名)
            String studentName = wxStudentSupport.getStudentName(s);
            salts.setStudentName(studentName);
            salts.setSaltsTime(System.currentTimeMillis());
            salts.setSaltsCause("正常销课");
            salts.setSaltsType(true);
            salts.setSaltsName(saltsInfo.getSaltsName());
            salts.setStudentId(s);
            salts.setCreateTime(System.currentTimeMillis());
            salts.setUpdateTime(System.currentTimeMillis());
            // TODO: student-学生课时减一 param 学员id return 学员课时数量减一
            wxStudentSupport.reduceStudentCourseNum(s);
            return wxCourseInfoMapper.addSalts(salts);
        }).sum();
    }

    @Override
    public int addMien(Mien mien) {
        mien.setCreateTime(System.currentTimeMillis());
        mien.setUpdateTime(System.currentTimeMillis());
        return wxCourseInfoMapper.addMien(mien);
    }
}

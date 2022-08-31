package com.jckj.service.impl;

import com.jckj.mapper.CourseInfoMapper;
import com.jckj.model.CourseInfo;
import com.jckj.service.CourseInfoService;
import com.jckj.vo.PageVo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author 柳江
 * @date 2022/8/29 15:39
 * @describe:
 */
@Service
public class CourseInfoServiceImpl implements CourseInfoService {
    @Resource
    private CourseInfoMapper courseInfoMapper;

    @Override
    public PageVo list(CourseInfo courseInfo) {
        List<CourseInfo> listCourseInfo = courseInfoMapper.findAll(courseInfo);
        return PageVo.successPage(listCourseInfo);
    }

    @Override
    public CourseInfo findById(CourseInfo courseInfo) {
        return courseInfoMapper.findById(courseInfo);
    }

    @Override
    public int count(CourseInfo courseInfo) {
        return courseInfoMapper.count(courseInfo);
    }

    @Override
    public int add(CourseInfo courseInfo, MultipartFile img) {
        try {
            Date date = new Date();
            long time = date.getTime();
            courseInfo.setCreateTime(time);
            courseInfo.setUpdateTime(time);
            if (img != null) {
                // 设置图片路径
                String filename = img.getOriginalFilename();
                String filepath = "E://upload//"+filename;
                // 转存图片
                img.transferTo(new File(filepath));
                courseInfo.setPhoto(filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courseInfoMapper.add(courseInfo);
    }

    @Override
    public int delete(String id) {
        String[] split = id.split(",");
        int delete = 0;
        for (String s : split) {
            CourseInfo courseInfo = new CourseInfo();
            courseInfo.setId(Integer.parseInt(s));
            Date date = new Date();
            long time = date.getTime();
            courseInfo.setUpdateTime(time);
            delete += courseInfoMapper.delete(courseInfo);
        }
        return delete;
    }

    @Override
    public int update(CourseInfo courseInfo, MultipartFile img) {
        try {
            Date date = new Date();
            long time = date.getTime();
            courseInfo.setUpdateTime(time);
            if (img != null) {
                // 设置图片路径
                String filename = img.getOriginalFilename();
                String filepath = "E://upload//"+filename;
                // 转存图片
                img.transferTo(new File(filepath));
                courseInfo.setPhoto(filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return courseInfoMapper.update(courseInfo);
    }
}

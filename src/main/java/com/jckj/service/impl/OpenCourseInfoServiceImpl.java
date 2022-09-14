package com.jckj.service.impl;

import com.jckj.mapper.OpenCourseMapper;
import com.jckj.model.OpenCourse;
import com.jckj.service.OpenCourseInfoService;
import com.jckj.util.QiniuFile;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/2 13:58
 * @describe:
 */
@Service
public class OpenCourseInfoServiceImpl implements OpenCourseInfoService {

    @Autowired
    private OpenCourseMapper openCourseMapper;
    @Override
    public PageVo list(OpenCourse openCourse) {
        List<OpenCourse> listopenCourse = openCourseMapper.findAll(openCourse);
        return PageVo.successPage(listopenCourse);
    }

    @Override
    public OpenCourse findById(OpenCourse openCourse) {
        return openCourseMapper.findById(openCourse);
    }

    @Override
    public int count(OpenCourse openCourse) {
        return openCourseMapper.count(openCourse);
    }

    @Override
    public int add(OpenCourse openCourse, MultipartFile img) {
        try {
            Date date = new Date();
            long time = date.getTime();
            openCourse.setCreateTime(time);
            openCourse.setUpdateTime(time);
            if (img != null) {
                //上传到七牛云
                String result = QiniuFile.loadFile(img.getBytes());
                openCourse.setPhoto("http://rhh643m33.hn-bkt.clouddn.com/" + result);
            }else {
                openCourse.setPhoto("http://rhh643m33.hn-bkt.clouddn.com/FiJV0oXj7ZgeJf0GlO2T9RM0F9cC");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openCourseMapper.add(openCourse);
    }

    @Override
    public int delete(String id) {
        String[] split = id.split(",");
        int delete = 0;
        for (String s : split) {
            OpenCourse openCourse = new OpenCourse();
            openCourse.setId(Integer.parseInt(s));
            Date date = new Date();
            long time = date.getTime();
            openCourse.setUpdateTime(time);
            delete += openCourseMapper.delete(openCourse);
        }
        return delete;
    }

    @Override
    public int update(OpenCourse openCourse, MultipartFile img) {
        try {
            Date date = new Date();
            long time = date.getTime();
            openCourse.setUpdateTime(time);
            if (img != null) {
                String result = QiniuFile.loadFile(img.getBytes());
                openCourse.setPhoto("http://rhh643m33.hn-bkt.clouddn.com/" + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openCourseMapper.update(openCourse);
    }
}

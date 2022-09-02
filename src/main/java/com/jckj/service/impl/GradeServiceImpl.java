package com.jckj.service.impl;

import com.jckj.dto.PageDto;
import com.jckj.mapper.GradeMapper;
import com.jckj.model.CourseInfo;
import com.jckj.model.Grade;
import com.jckj.model.School;
import com.jckj.service.GradeService;
import com.jckj.util.QiniuFile;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:05
 * @description:
 */
@Service
public class GradeServiceImpl implements GradeService {

    @Autowired
    private GradeMapper gradeMapper;

    /**
     * 查询全部
     * @param grade
     * @return PageVo
     */

    @Override
    public PageVo list(Grade grade) {
        return PageVo.successPage(gradeMapper.list(grade));
    }

    /**
     * 查询总条数
     * @param grade
     * @return Integer
     */

    @Override
    public Integer count(Grade grade) {
        return gradeMapper.count(grade);
    }

    /**
     * 添加
     * @param grade
     * @param img
     * @return Integer
     */

    @Override
    public Integer insert(Grade grade, MultipartFile img) {
        try {
            if (img != null) {
                //上传到七牛云
                String result = QiniuFile.loadFile(img.getBytes());
                grade.setGradePhoto("http://rhh643m33.hn-bkt.clouddn.com/" + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        grade.setCreateTime(System.currentTimeMillis());
        grade.setUpdateTime(System.currentTimeMillis());
        Integer insert = gradeMapper.insert(grade);
        return insert;
    }

    /**
     * 修改
     * @param grade
     * @return Integer
     */

    @Override
    public Integer update(Grade grade) {
        grade.setUpdateTime(System.currentTimeMillis());
        Integer update = gradeMapper.update(grade);
        return update;
    }

    /**
     * 删除
     * @param str
     * @return Integer
     */

    @Override
    public Integer delete(String str) {
        Integer delete = 0;
        String[] strs = str.split(",");
        for (String s : strs) {
            Grade grade = new Grade();
            grade.setId(Integer.parseInt(s));
            grade.setUpdateTime(System.currentTimeMillis());
            delete += gradeMapper.delete(grade);
        }
        return delete;
    }
}

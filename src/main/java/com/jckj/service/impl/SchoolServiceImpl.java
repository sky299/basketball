package com.jckj.service.impl;

import com.jckj.dto.PageDto;
import com.jckj.mapper.SchoolMapper;
import com.jckj.model.CourseInfo;
import com.jckj.model.School;
import com.jckj.service.SchoolService;
import com.jckj.util.QiniuFile;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:05
 * @description:
 */
@Service
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolMapper schoolMapper;

    /**
     * 查询全部
     * @param school
     * @return PageVo
     */

    @Override
    public PageVo list(School school) {
        return PageVo.successPage(schoolMapper.list(school));
    }

    /**
     * 查询总条数
     * @param school
     * @return Integer
     */

    @Override
    public Integer count(School school) {
        return schoolMapper.count(school);
    }

    /**
     * 添加
     * @param school
     * @param img
     * @return Integer
     */

    @Override
    public Integer insert(School school, MultipartFile img) {
        try {
            if (img != null) {
                //上传到七牛云
                String result = QiniuFile.loadFile(img.getBytes());
                school.setSchoolPhoto("http://rhh643m33.hn-bkt.clouddn.com/" + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        school.setCreateTime(System.currentTimeMillis());
        school.setUpdateTime(System.currentTimeMillis());
        Integer insert = schoolMapper.insert(school);
        return insert;
    }

    /**
     * 修改
     * @param school
     * @return Integer
     */

    @Override
    public Integer update(School school) {
        school.setUpdateTime(System.currentTimeMillis());
        Integer update = schoolMapper.update(school);
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
            School school = new School();
            school.setId(Integer.parseInt(s));
            school.setUpdateTime(System.currentTimeMillis());
            delete += schoolMapper.delete(school);
        }
        return delete;
    }
}

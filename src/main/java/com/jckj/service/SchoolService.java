package com.jckj.service;

import com.jckj.dto.PageDto;
import com.jckj.model.CourseInfo;
import com.jckj.model.Grade;
import com.jckj.model.School;
import com.jckj.vo.PageVo;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:02
 * @description:
 */
public interface SchoolService {

    /**
     * 查询全部
     * @param school
     * @return PageVo
     */

    public PageVo list(School school);

    /**
     * 查询总条数
     * @param school
     * @return Integer
     */

    public Integer count(School school);

    /**
     * 添加
     * @param school
     * @param img
     * @return Integer
     */

    public Integer insert(School school, MultipartFile img);

    /**
     * 修改
     * @param school
     * @return Integer
     */

    public Integer update(School school);

    /**
     * 删除
     * @param str
     * @return Integer
     */

    public Integer delete(String str);
}

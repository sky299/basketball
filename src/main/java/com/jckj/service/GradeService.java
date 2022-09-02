package com.jckj.service;

import com.jckj.dto.PageDto;
import com.jckj.model.CourseInfo;
import com.jckj.model.Grade;
import com.jckj.model.TStudentInfo;
import com.jckj.vo.PageVo;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:02
 * @description:
 */
public interface GradeService {

    /**
     * 查询全部
     * @param grade
     * @return PageVo
     */

    public PageVo list(Grade grade);

    /**
     * 查询总条数
     * @param grade
     * @return Integer
     */

    public Integer count(Grade grade);

    /**
     * 添加
     * @param grade
     * @param img
     * @return Integer
     */

    public Integer insert(Grade grade, MultipartFile img);

    /**
     * 修改
     * @param grade
     * @return Integer
     */

    public Integer update(Grade grade);

    /**
     * 删除
     * @param str
     * @return Integer
     */

    public Integer delete(String str);
}

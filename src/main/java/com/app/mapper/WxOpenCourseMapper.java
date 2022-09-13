package com.app.mapper;

import com.jckj.model.OpenCourse;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 小江
 * @date 2022/9/13 16:30
 * @describe:
 */
@Repository
public interface WxOpenCourseMapper {
    /**
     * 公开课程查询
     * @param openCourse 课程对象
     * @return 课程集合
     */
    List<OpenCourse> findAll(OpenCourse openCourse);
}

package com.jckj.mapper;

import com.jckj.model.OpenCourse;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/2 14:03
 * @describe:
 */
@Repository
public interface OpenCourseMapper {
    /**
     * 公共课程列表
     * @param openCourse 公共课程对象
     * @return 公共课程集合
     */
    public List<OpenCourse> findAll(OpenCourse openCourse);

    /**
     * 公共课程详情
     * @param openCourse 公共课程对象
     * @return 公共课程对象
     */
    public OpenCourse findById(OpenCourse openCourse);

    /**
     * 公共课程列表总数
     * @param openCourse 公共课程对象
     * @return 总数
     */
    public Integer count(OpenCourse openCourse);

    /**
     * 添加
     * @param openCourse 公共课程对象
     * @return 成功条数
     */
    public int add(OpenCourse openCourse);

    /**
     * 删除
     * @param openCourse 公共课程对象
     * @return 成功条数
     */
    public int delete(OpenCourse openCourse);

    /**
     * 修改
     * @param openCourse 公共课程对象
     * @return 成功条数
     */
    public int update(OpenCourse openCourse);
}

package com.jckj.mapper;

import com.jckj.model.CourseInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 柳江
 * @date 2022/8/29 15:30
 * @describe:
 */
@Repository
public interface CourseInfoMapper {

    /**
     * 课程列表
     * @param courseInfo 课程对象
     * @return 课程集合
     */
    public List<CourseInfo> findAll(CourseInfo courseInfo);

    /**
     * 课程详情
     * @param courseInfo 课程对象
     * @return 课程对象
     */
    public CourseInfo findById(CourseInfo courseInfo);

    /**
     * 课程列表总数
     * @param courseInfo 课程对象
     * @return 总数
     */
    public Integer count(CourseInfo courseInfo);

    /**
     * 添加
     * @param courseInfo 课程对象
     * @return 成功条数
     */
    public int add(CourseInfo courseInfo);

    /**
     * 删除
     * @param courseInfo 课程对象
     * @return 成功条数
     */
    public int delete(CourseInfo courseInfo);

    /**
     * 修改
     * @param courseInfo 课程对象
     * @return 成功条数
     */
    public int update(CourseInfo courseInfo);

}
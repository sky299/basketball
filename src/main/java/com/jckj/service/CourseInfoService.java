package com.jckj.service;

import com.jckj.model.CourseInfo;
import com.jckj.vo.PageVo;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 柳江
 * @date 2022/8/29 15:30
 * @describe:
 */
public interface CourseInfoService {

    /**
     * 课程列表
     * @param courseInfo 课程对象
     * @return 课程集合
     */
    public PageVo list(CourseInfo courseInfo);

    /**
     * 课程详情
     * @param courseInfo 课程对象
     * @return 课程对象
     */
    public CourseInfo findById(CourseInfo courseInfo);

    /**
     * 课程列表总数
     * @param courseInfo 课程对象
     * @return 课程总数
     */
    public int count(CourseInfo courseInfo);

    /**
     * 课程添加
     * @param courseInfo 课程对象
     * @param img 图片
     * @return 成功条数
     */
    public int add(CourseInfo courseInfo, MultipartFile img);

    /**
     * 课程删除
     * @param id 课程id
     * @return 成功条数
     */
    public int delete(String id);

    /**
     * 课程修改
     * @param courseInfo 课程对象
     * @param img 图片
     * @return 成功条数
     */
    public int update(CourseInfo courseInfo, MultipartFile img);
}

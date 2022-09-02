package com.jckj.service;

import com.jckj.model.OpenCourse;
import com.jckj.vo.PageVo;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 柳江
 * @date 2022/9/2 13:55
 * @describe:
 */
public interface OpenCourseInfoService {
    /**
     * 公共课程列表
     * @param openCourse 公共课程对象
     * @return 公共课程集合
     */
    public PageVo list(OpenCourse openCourse);

    /**
     * 公共课程详情
     * @param openCourse 公共课程对象
     * @return 公共课程对象
     */
    public OpenCourse findById(OpenCourse openCourse);

    /**
     * 公共课程列表总数
     * @param openCourse 公共课程对象
     * @return 公共课程总数
     */
    public int count(OpenCourse openCourse);

    /**
     * 公共课程添加
     * @param openCourse 公共课程对象
     * @param img 图片
     * @return 成功条数
     */
    public int add(OpenCourse openCourse, MultipartFile img);

    /**
     * 公共课程删除
     * @param id 公共课程id
     * @return 成功条数
     */
    public int delete(String id);

    /**
     * 公共课程修改
     * @param openCourse 公共课程对象
     * @param img 图片
     * @return 成功条数
     */
    public int update(OpenCourse openCourse, MultipartFile img);
}

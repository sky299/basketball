package com.jckj.service;

import com.jckj.model.OpenStyle;
import com.jckj.vo.PageVo;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 柳江
 * @date 2022/9/1 14:48
 * @describe:
 */
public interface OpenStyleService {
    /**
     * 风采信息列表
     * @param openStyle 风采对象
     * @return PageVo课程集合
     */
    public PageVo list(OpenStyle openStyle);

    /**
     * 风采信息详情
     * @param openStyle 风采对象
     * @return 课程对象
     */
    public OpenStyle findById(OpenStyle openStyle);

    /**
     * 风采信息列表总数
     * @param openStyle 风采对象
     * @return 风采信息总数
     */
    public int count(OpenStyle openStyle);

    /**
     * 风采信息添加
     * @param openStyle 风采对象
     * @param img 图片
     * @return 成功条数
     */
    public int add(OpenStyle openStyle, MultipartFile img,MultipartFile video);

    /**
     * 风采信息删除
     * @param id 风采id
     * @return 成功条数
     */
    public int delete(String id);

    /**
     * 风采信息修改
     * @param openStyle 风采对象
     * @param img 图片
     * @return 成功条数
     */
    public int update(OpenStyle openStyle, MultipartFile img,MultipartFile video);
}

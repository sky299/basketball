package com.jckj.mapper;

import com.jckj.model.OpenStyle;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/1 14:58
 * @describe:
 */
@Repository
public interface OpenStyleMapper {
    /**
     * 风采信息列表
     * @param openStyle 风采对象
     * @return 课程集合
     */
     List<OpenStyle> findAll(OpenStyle openStyle);

    /**
     * 风采信息详情
     * @param openStyle 风采对象
     * @return 课程对象
     */
     OpenStyle findById(OpenStyle openStyle);

    /**
     * 风采信息列表总数
     * @param openStyle 风采对象
     * @return 风采信息总数
     */
     int count(OpenStyle openStyle);

    /**
     * 风采信息添加
     * @param openStyle 风采对象
     * @return 成功条数
     */
     int add(OpenStyle openStyle);

    /**
     * 风采信息删除
     * @param openStyle 风采对象
     * @return 成功条数
     */
    int delete(OpenStyle openStyle);

    /**
     * 风采信息修改
     * @param openStyle 风采对象
     * @return 成功条数
     */
     int update(OpenStyle openStyle);
}

package com.jckj.mapper;

import com.jckj.model.OpenRotation;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/2 13:07
 * @describe:
 */
@Repository
public interface OpenRotationMapper {
    /**
     * 轮播图列表
     * @param openRotation 轮播图
     * @return 轮播图集合
     */
    public List<OpenRotation> findAll(OpenRotation openRotation);

    /**
     * 轮播图详情
     * @param openRotation 轮播图对象
     * @return 轮播图对象
     */
    public OpenRotation findById(OpenRotation openRotation);

    /**
     * 轮播图列表总数
     * @return 总数
     */
    public Integer count();

    /**
     * 添加
     * @param openRotation 轮播图对象
     * @return 成功条数
     */
    public int add(OpenRotation openRotation);

    /**
     * 删除
     * @param openRotation 轮播图对象
     * @return 成功条数
     */
    public int delete(OpenRotation openRotation);

    /**
     * 修改
     * @param openRotation 轮播图对象
     * @return 成功条数
     */
    public int update(OpenRotation openRotation);
}

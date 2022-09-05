package com.jckj.service;

import com.jckj.model.OpenRotation;
import com.jckj.vo.PageVo;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 柳江
 * @date 2022/9/2 13:07
 * @describe:
 */
public interface OpenRotationService {
    /**
     * 轮播图列表
     * @param openProblem 轮播图
     * @return 轮播图集合
     */
    public PageVo list(OpenRotation openProblem);

    /**
     * 轮播图详情
     * @param openProblem 轮播图
     * @return 轮播图
     */
    public OpenRotation findById(OpenRotation openProblem);

    /**
     * 轮播图总数
     * @return 轮播图
     */
    public int count();

    /**
     * 轮播图添加
     * @param openProblem 轮播图
     * @param img 图片
     * @return 成功条数
     */
    public int add(OpenRotation openProblem);

    /**
     * 轮播图删除
     * @param id 轮播图id
     * @return 成功条数
     */
    public int delete(String id);

    /**
     * 轮播图修改
     * @param openProblem 轮播图
     * @param img 图片
     * @return 成功条数
     */
    public int update(OpenRotation openProblem, MultipartFile img);
}

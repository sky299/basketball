package com.jckj.service;

import com.jckj.model.OpenProblem;
import com.jckj.vo.PageVo;

/**
 * @author 柳江
 * @date 2022/9/2 1:27
 * @describe:
 */
public interface OpenProblemService {
    /**
     * 问题列表
     * @param openProblem 问题
     * @return 问题集合
     */
    public PageVo list(OpenProblem openProblem);

    /**
     * 问题详情
     * @param openProblem 问题
     * @return 问题
     */
    public OpenProblem findById(OpenProblem openProblem);

    /**
     * 问题总数
     * @return 问题总数
     */
    public int count();

    /**
     * 问题添加
     * @param openProblem 问题
     * @return 成功条数
     */
    public int add(OpenProblem openProblem);

    /**
     * 问题删除
     * @param id 问题id
     * @return 成功条数
     */
    public int delete(String id);

    /**
     * 问题修改
     * @param openProblem 问题
     * @return 成功条数
     */
    public int update(OpenProblem openProblem);
}

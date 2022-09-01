package com.jckj.mapper;

import com.jckj.model.OpenProblem;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/2 1:33
 * @describe:
 */
@Repository
public interface OpenProblemMapper {
    /**
     * 问题列表
     * @param openProblem 问题对象
     * @return 问题集合
     */
    public List<OpenProblem> findAll(OpenProblem openProblem);

    /**
     * 问题详情
     * @param openProblem 问题对象
     * @return 问题对象
     */
    public OpenProblem findById(OpenProblem openProblem);

    /**
     * 问题列表总数
     * @return 总数
     */
    public Integer count();

    /**
     * 添加
     * @param openProblem 问题对象
     * @return 成功条数
     */
    public int add(OpenProblem openProblem);

    /**
     * 删除
     * @param openProblem 问题对象
     * @return 成功条数
     */
    public int delete(OpenProblem openProblem);

    /**
     * 修改
     * @param openProblem 问题对象
     * @return 成功条数
     */
    public int update(OpenProblem openProblem);

}

package com.jckj.mapper;

import com.jckj.model.OpenAnswer;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author 柳江
 * @date 2022/9/2 9:53
 * @describe:
 */
@Repository
public interface OpenAnswerMapper {
    /**
     * 对应问题的答案
     * @param openAnswer 答案对象
     * @return 答案对象
     */
    public List<OpenAnswer> find(OpenAnswer openAnswer);

    /**
     * 添加答案
     * @param openAnswer 答案对象
     * @return 成功条数
     */
    public Integer add(OpenAnswer openAnswer);

    /**
     * 答案修改
     * @param openAnswer 答案对象
     * @return 成功条数
     */
    public Integer update(OpenAnswer openAnswer);

    /**
     * 答案删除
     * @param openAnswer 答案对象
     * @return 成功条数
     */
    public Integer delete(OpenAnswer openAnswer);
}

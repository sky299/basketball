package com.jckj.mapper;

import com.jckj.model.OpenIntegral;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/2 0:43
 * @describe:
 */
@Repository
public interface OpenIntegralMapper {
    /**
     * 积分获取方式列表
     * @param openIntegral 积分获取方式
     * @return 积分获取方式集合
     */
    public List<OpenIntegral> findAll(OpenIntegral openIntegral);

    /**
     * 积分获取方式详情
     * @param openIntegral 积分获取方式
     * @return 积分获取方式
     */
    public OpenIntegral findById(OpenIntegral openIntegral);

    /**
     * 积分获取方式列表总数
     * @return 总数
     */
    public Integer count();

    /**
     * 添加
     * @param openIntegral 积分获取方式
     * @return 成功条数
     */
    public int add(OpenIntegral openIntegral);

    /**
     * 删除
     * @param openIntegral 积分获取方式
     * @return 成功条数
     */
    public int delete(OpenIntegral openIntegral);

    /**
     * 修改
     * @param openIntegral 积分获取方式
     * @return 成功条数
     */
    public int update(OpenIntegral openIntegral);
}

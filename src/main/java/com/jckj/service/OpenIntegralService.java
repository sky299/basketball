package com.jckj.service;

import com.jckj.model.OpenIntegral;
import com.jckj.vo.PageVo;

/**
 * @author 柳江
 * @date 2022/9/2 0:36
 * @describe:
 */
public interface OpenIntegralService {
    /**
     * 积分获取方式列表
     * @param openIntegral 积分获取方式
     * @return 积分获取方式集合
     */
    public PageVo list(OpenIntegral openIntegral);

    /**
     * 积分获取方式详情
     * @param openIntegral 积分获取方式
     * @return 积分获取方式
     */
    public OpenIntegral findById(OpenIntegral openIntegral);

    /**
     * 积分获取方式列表总数
     * @param openIntegral 积分获取方式
     * @return 积分获取方式总数
     */
    public int count();

    /**
     * 积分获取方式添加
     * @param openIntegral 积分获取方式
     * @return 成功条数
     */
    public int add(OpenIntegral openIntegral);

    /**
     * 积分获取方式删除
     * @param id 积分获取方式id
     * @return 成功条数
     */
    public int delete(String id);

    /**
     * 积分获取方式修改
     * @param openIntegral 积分获取方式
     * @return 成功条数
     */
    public int update(OpenIntegral openIntegral);
}

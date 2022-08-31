package com.jckj.service.impl;

import com.jckj.mapper.MienMapper;
import com.jckj.model.Mien;
import com.jckj.service.MienService;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:05
 * @description:
 */
@Service
public class MienServiceImpl implements MienService {

    @Autowired
    private MienMapper mienMapper;

    /**
     * 查询全部
     * @param mien
     * @return PageVo
     */

    @Override
    public PageVo list(Mien mien) {
        return PageVo.successPage(mienMapper.list(mien));
    }

    /**
     * 查询总条数
     * @param mien
     * @return Integer
     */

    @Override
    public Integer count(Mien mien) {
        return mienMapper.count(mien);
    }

    /**
     * 添加
     * @param mien
     * @return Integer
     */

    @Override
    public Integer insert(Mien mien) {
        mien.setCreateTime(System.currentTimeMillis());
        mien.setUpdateTime(System.currentTimeMillis());
        return mienMapper.insert(mien);
    }

    /**
     * 修改
     * @param mien
     * @return Integer
     */

    @Override
    public Integer update(Mien mien) {
        mien.setUpdateTime(System.currentTimeMillis());
        return mienMapper.update(mien);
    }

    /**
     * 删除
     * @param mien
     * @return Integer
     */

    @Override
    public Integer delete(Mien mien) {
        mien.setUpdateTime(System.currentTimeMillis());
        return mienMapper.delete(mien);
    }
}

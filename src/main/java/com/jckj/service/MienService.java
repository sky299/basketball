package com.jckj.service;

import com.jckj.model.Mien;
import com.jckj.vo.PageVo;

import java.util.List;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:02
 * @description:
 */
public interface MienService {

    /**
     * @param mien
     * @return List
     * 查询全部
     */

    public PageVo list(Mien mien);

    /**
     * @param mien
     * @return Integer
     * 查询全部
     */

    public Integer count(Mien mien);

    /**
     * @param mien
     * @return Integer
     * 添加
     */

    public Integer insert(Mien mien);

    /**
     * @param mien
     * @return Integer
     * 修改
     */

    public Integer update(Mien mien);

    /**
     * @param mien
     * @return Integer
     * 删除
     */

    public Integer delete(Mien mien);
}

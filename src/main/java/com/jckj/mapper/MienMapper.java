package com.jckj.mapper;

import com.jckj.model.Mien;

import java.util.List;

/**
 * @author: SkLily
 * @date: 2022/8/29 14:53
 * @description:
 */
public interface MienMapper {

    /**
     * 查询全部
     * @param mien
     * @return List
     */

    public List<Mien> list(Mien mien);

    /**
     * 查询全部条数
     * @param mien
     * @return Integer
     */

    public Integer count(Mien mien);

    /**
     * 添加
     * @param mien
     * @return Integer
     */

    public Integer insert(Mien mien);

    /**
     * 修改
     * @param mien
     * @return Integer
     */

    public Integer update(Mien mien);

    /**
     * 删除
     * @param mien
     * @return Integer
     */

    public Integer delete(Mien mien);

    /**
     * 给公共风采模块
     * 查询全部
     * @param schoolName
     * @return List
     */

    public List<Mien> listOpenMien(String schoolName);

    /**
     * 给公共风采模块
     * 根据id查询
     * @param id
     * @return List
     */

    public List<Mien> listFindById(Integer id);
}

package com.jckj.service.support;

import com.jckj.mapper.MienMapper;
import com.jckj.model.Mien;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: SkLily
 * @date: 2022/8/31 18:44
 * @description:
 */
@Component
public class MienSupport {

    @Autowired
    private MienMapper mienMapper;

    /**
     * 给公共风采模块
     * 查询全部
     * @param schoolName
     * @return List
     */

    public List<Mien> listOpenMien(String schoolName){
        List<Mien> list = mienMapper.listOpenMien(schoolName);
        return list;
    }

    /**
     * 给公共风采模块
     * 根据id查询
     * @param id
     * @return List
     */

    public List<Mien> listFindById(Integer id){
        List<Mien> list = mienMapper.listFindById(id);
        return list;
    }
}

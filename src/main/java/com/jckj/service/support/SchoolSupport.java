package com.jckj.service.support;

import com.jckj.mapper.SchoolMapper;
import com.jckj.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: SkLily
 * @date: 2022/8/31 18:44
 * @description:
 */
@Component
public class SchoolSupport {

    @Autowired
    private SchoolMapper schoolMapper;

    /**
     * 给公共校区模块
     * 查询全部
     * @param
     * @return List
     */

    public List<School> listOpenSchool(){
        List<School> list = schoolMapper.listOpenSchool();
        return list;
    }

    /**
     * 给公共校区模块
     * 根据校区名字查询
     * @param schoolName
     * @return List
     */

    public List<School> listFindBySchoolName(String schoolName){
        List<School> list = schoolMapper.listFindBySchoolName(schoolName);
        return list;
    }
}

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

    //给校区模块
//    public List<School> list(){
//        List<School> list = schoolMapper.list();
//        return list;
//    }
}

package com.jckj.service.impl;

import com.jckj.dto.PageDto;
import com.jckj.mapper.StudentMapper;
import com.jckj.model.TStudentInfo;
import com.jckj.service.StudentService;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public PageVo list(TStudentInfo tStudentInfo) {
        return PageVo.successPage(studentMapper.list(tStudentInfo));
    }

    @Override
    public TStudentInfo info(Integer id) {
        return studentMapper.info(id);
    }

    @Override
    public void add(TStudentInfo tStudentInfo) {
        tStudentInfo.setDelete(false);
        tStudentInfo.setStudentId(UUID.randomUUID().toString());
        tStudentInfo.setCreateTime(System.currentTimeMillis());
        tStudentInfo.setUpdateTime(System.currentTimeMillis());
        studentMapper.add(tStudentInfo);
    }

    @Override
    public void update(TStudentInfo tStudentInfo) {
        tStudentInfo.setUpdateTime(System.currentTimeMillis());
        studentMapper.update(tStudentInfo);
    }

    @Override
    public void remove(Integer id) {
        studentMapper.remove(id);
    }

    @Override
    public Integer count(PageDto pageDto) {
        return studentMapper.count(pageDto);
    }
}

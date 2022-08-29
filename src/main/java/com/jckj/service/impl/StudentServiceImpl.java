package com.jckj.service.impl;

import com.jckj.dto.PageDto;
import com.jckj.mapper.StudentMapper;
import com.jckj.model.TStudentInfo;
import com.jckj.service.StudentService;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public PageVo list(PageDto pageDto) {
        Integer count = studentMapper.count(pageDto);
        if (count == 0) {
            return PageVo.successPage();
        }
        return PageVo.successPage(studentMapper.list(pageDto), count);
    }

    @Override
    public TStudentInfo info(Integer id) {
        return studentMapper.info(id);
    }

    @Override
    public void add(TStudentInfo tStudentInfo) {
        studentMapper.add(tStudentInfo);
    }

    @Override
    public void update(TStudentInfo tStudentInfo) {
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

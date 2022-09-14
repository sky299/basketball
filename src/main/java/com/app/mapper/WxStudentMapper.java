package com.app.mapper;

import com.jckj.dto.PageDto;
import com.jckj.model.TStudentInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WxStudentMapper {

    List<TStudentInfo> list(PageDto pageDto);

    Integer count(PageDto pageDto);

    TStudentInfo info(String studentId);

    void update(TStudentInfo tStudentInfo);
}

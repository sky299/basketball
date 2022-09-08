package com.app.mapper;

import com.jckj.model.Enroll;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WxEnrollMapper {

    void insert(Enroll enroll);

    List<Enroll> list(Enroll enroll);
}

package com.jckj.mapper;

import com.jckj.model.PhotoInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhotoInfoMapper {

    public List<PhotoInfo> findAll();

    public Integer count();

    public Integer update(PhotoInfo photoInfo);

}

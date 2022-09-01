package com.jckj.service.impl;

import com.jckj.mapper.PhotoInfoMapper;
import com.jckj.model.PhotoInfo;
import com.jckj.service.PhotoInfoService;
import com.jckj.vo.PageVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/1 0:30
 * @describe:
 */
@Service
public class PhotoInfoServiceImpl implements PhotoInfoService {

    @Resource
    private PhotoInfoMapper photoInfoMapper;

    @Override
    public PageVo list() {
        List<PhotoInfo> listPhotoInfo = photoInfoMapper.findAll();
        return PageVo.successPage(listPhotoInfo);
    }

    @Override
    public int count() {
        return photoInfoMapper.count();
    }
}

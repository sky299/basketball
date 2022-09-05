package com.jckj.service.impl;

import com.jckj.mapper.OpenRotationMapper;
import com.jckj.model.OpenRotation;
import com.jckj.service.OpenRotationService;
import com.jckj.util.QiniuFile;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/2 13:08
 * @describe:
 */
@Service
public class OpenRotationServiceImpl implements OpenRotationService {

    @Autowired
    private OpenRotationMapper openRotationMapper;
    @Override
    public PageVo list(OpenRotation openRotation) {
        List<OpenRotation> listOpenRotation = openRotationMapper.findAll(openRotation);
        return PageVo.successPage(listOpenRotation);
    }

    @Override
    public OpenRotation findById(OpenRotation openRotation) {
        return openRotationMapper.findById(openRotation);
    }

    @Override
    public int count() {
        return openRotationMapper.count();
    }

    @Override
    public int add(OpenRotation openRotation, MultipartFile img) {
        try {
            Date date = new Date();
            long time = date.getTime();
            openRotation.setCreateTime(time);
            openRotation.setUpdateTime(time);
            if (img != null) {
                String result = QiniuFile.loadFile(img.getBytes());
                openRotation.setSchoolPhoto("http://rhh643m33.hn-bkt.clouddn.com/" + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openRotationMapper.add(openRotation);
    }

    @Override
    public int delete(String id) {
        String[] split = id.split(",");
        int delete = 0;
        for (String s : split) {
            OpenRotation openRotation = new OpenRotation();
            openRotation.setId(Integer.parseInt(s));
            Date date = new Date();
            long time = date.getTime();
            openRotation.setUpdateTime(time);
            delete += openRotationMapper.delete(openRotation);
        }
        return delete;
    }

    @Override
    public int update(OpenRotation openRotation, MultipartFile img) {
        try {
            Date date = new Date();
            long time = date.getTime();
            openRotation.setUpdateTime(time);
            if (img != null) {
                String result = QiniuFile.loadFile(img.getBytes());
                openRotation.setSchoolPhoto("http://rhh643m33.hn-bkt.clouddn.com/" + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openRotationMapper.update(openRotation);
    }
}

package com.jckj.service.impl;

import com.jckj.mapper.OpenStyleMapper;
import com.jckj.model.OpenStyle;
import com.jckj.service.OpenStyleService;
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
 * @date 2022/9/1 14:54
 * @describe:
 */
@Service
public class OpenStyleServiceImpl implements OpenStyleService {

    @Autowired
    private OpenStyleMapper openStyleMapper;

    @Override
    public PageVo list(OpenStyle openStyle) {
        List<OpenStyle> list = openStyleMapper.findAll(openStyle);
        return PageVo.successPage(list);
    }

    @Override
    public OpenStyle findById(OpenStyle openStyle) {
        return openStyleMapper.findById(openStyle);
    }

    @Override
    public int count(OpenStyle openStyle) {
        return openStyleMapper.count(openStyle);
    }

    @Override
    public int add(OpenStyle openStyle, MultipartFile img,MultipartFile video) {
        try {
            Date date = new Date();
            long time = date.getTime();
            openStyle.setCreateTime(time);
            openStyle.setUpdateTime(time);
            if (img != null) {
                // 设置图片路径
                String filename = img.getOriginalFilename();
                String filepath = "E://upload//"+filename;
                // 转存图片
                img.transferTo(new File(filepath));
                openStyle.setPicture(filename);
            }
            if (video != null){
                // 设置视频路径
                String filename = video.getOriginalFilename();
                String filepath = "E://upload//"+filename;
                // 转存视频
                video.transferTo(new File(filepath));
                openStyle.setPicture(filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openStyleMapper.add(openStyle);
    }

    @Override
    public int delete(String id) {
        String[] split = id.split(",");
        int delete = 0;
        for (String s : split) {
            OpenStyle openStyle = new OpenStyle();
            openStyle.setId(Integer.parseInt(s));
            Date date = new Date();
            long time = date.getTime();
            openStyle.setUpdateTime(time);
            delete += openStyleMapper.delete(openStyle);
        }
        return delete;
    }

    @Override
    public int update(OpenStyle openStyle, MultipartFile img,MultipartFile video) {
        try {
            Date date = new Date();
            long time = date.getTime();
            openStyle.setUpdateTime(time);
            if (img != null) {
                // 设置图片路径
                String filename = img.getOriginalFilename();
                String filepath = "E://upload//"+filename;
                // 转存图片
                img.transferTo(new File(filepath));
                openStyle.setPicture(filename);
            }
            if (video != null){
                // 设置视频路径
                String filename = video.getOriginalFilename();
                String filepath = "E://upload//"+filename;
                // 转存视频
                video.transferTo(new File(filepath));
                openStyle.setPicture(filename);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openStyleMapper.update(openStyle);
    }
}

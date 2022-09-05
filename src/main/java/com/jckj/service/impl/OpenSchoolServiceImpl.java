package com.jckj.service.impl;

import com.jckj.mapper.OpenSchoolMapper;
import com.jckj.model.OpenSchool;
import com.jckj.service.OpenSchoolService;
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
 * @date 2022/9/2 15:28
 * @describe:
 */
@Service
public class OpenSchoolServiceImpl implements OpenSchoolService {

    @Autowired
    private OpenSchoolMapper openSchoolMapper;

    @Override
    public PageVo list(OpenSchool openSchool) {
        List<OpenSchool> listOpenSchool = openSchoolMapper.findAll(openSchool);
        return PageVo.successPage(listOpenSchool);
    }

    @Override
    public OpenSchool findById(OpenSchool openSchool) {
        return openSchoolMapper.findById(openSchool);
    }

    @Override
    public int count(OpenSchool openSchool) {
        return openSchoolMapper.count(openSchool);
    }

    @Override
    public int add(OpenSchool openSchool, MultipartFile img) {
        try {
            Date date = new Date();
            long time = date.getTime();
            openSchool.setCreateTime(time);
            openSchool.setUpdateTime(time);
            if (img != null) {
                String result = QiniuFile.loadFile(img.getBytes());
                openSchool.setSchoolPhoto("http://rhh643m33.hn-bkt.clouddn.com/" + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openSchoolMapper.add(openSchool);
    }

    @Override
    public int delete(String id) {
        String[] split = id.split(",");
        int delete = 0;
        for (String s : split) {
            OpenSchool openSchool = new OpenSchool();
            openSchool.setId(Integer.parseInt(s));
            Date date = new Date();
            long time = date.getTime();
            openSchool.setUpdateTime(time);
            delete += openSchoolMapper.delete(openSchool);
        }
        return delete;
    }

    @Override
    public int update(OpenSchool openSchool, MultipartFile img) {
        try {
            Date date = new Date();
            long time = date.getTime();
            openSchool.setUpdateTime(time);
            if (img != null) {
                String result = QiniuFile.loadFile(img.getBytes());
                openSchool.setSchoolPhoto("http://rhh643m33.hn-bkt.clouddn.com/" + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return openSchoolMapper.update(openSchool);
    }
}

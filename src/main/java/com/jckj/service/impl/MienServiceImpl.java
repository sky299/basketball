package com.jckj.service.impl;

import com.jckj.mapper.MienMapper;
import com.jckj.model.Mien;
import com.jckj.service.MienService;
import com.jckj.util.QiniuFile;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:05
 * @description:
 */
@Service
public class MienServiceImpl implements MienService {

    @Autowired
    private MienMapper mienMapper;

    /**
     * 查询全部
     * @param mien
     * @return PageVo
     */

    @Override
    public PageVo list(Mien mien) {
        return PageVo.successPage(mienMapper.list(mien));
    }

    /**
     * 查询总条数
     * @param mien
     * @return Integer
     */

    @Override
    public Integer count(Mien mien) {
        return mienMapper.count(mien);
    }

    /**
     * 添加
     * @param mien
     * @param img
     * @param video
     * @return Integer
     */

    @Override
    public Integer insert(Mien mien, MultipartFile img, MultipartFile video){
        try {
            if (img != null) {
                //上传到七牛云
                String result = QiniuFile.loadFile(img.getBytes());
                mien.setMienPhoto("http://rhh643m33.hn-bkt.clouddn.com/" + result);
            }
            if (video != null) {
                //上传到七牛云
                String result = QiniuFile.loadFile(video.getBytes());
                mien.setMienVideo("http://rhh643m33.hn-bkt.clouddn.com/" + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        mien.setCreateTime(System.currentTimeMillis());
        mien.setUpdateTime(System.currentTimeMillis());
        Integer insert = mienMapper.insert(mien);
        return insert;
    }

    /**
     * 修改
     * @param mien
     * @param img
     * @param video
     * @return Integer
     */

    @Override
    public Integer update(Mien mien,MultipartFile img,MultipartFile video){
        try {
            if (img != null) {
                //上传到七牛云
                String result = QiniuFile.loadFile(img.getBytes());
                mien.setMienPhoto("http://rhh643m33.hn-bkt.clouddn.com/" + result);
            }
            if (video != null) {
                //上传到七牛云
                String result = QiniuFile.loadFile(video.getBytes());
                mien.setMienVideo("http://rhh643m33.hn-bkt.clouddn.com/" + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        mien.setUpdateTime(System.currentTimeMillis());
        Integer update = mienMapper.update(mien);
        return update;
    }

    /**
     * 删除
     * @param str
     * @return Integer
     */

    @Override
    public Integer delete(String str) {
        Integer delete = 0;
        String[] strs = str.split(",");
        for (String s : strs) {
            Mien mien = new Mien();
            mien.setId(Integer.parseInt(s));
            mien.setUpdateTime(System.currentTimeMillis());
            delete += mienMapper.delete(mien);
        }
        return delete;
    }
}

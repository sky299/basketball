package com.jckj.service;

import com.jckj.model.Mien;
import com.jckj.vo.PageVo;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author: SkLily
 * @date: 2022/8/29 15:02
 * @description:
 */
public interface MienService {

    /**
     * 查询全部
     * @param mien
     * @return List
     */

    public PageVo list(Mien mien);

    /**
     * 查询全部
     * @param mien
     * @return Integer
     */

    public Integer count(Mien mien);

    /**
     * 添加
     * @param mien
     * @param img
     * @param video
     * @return Integer
     */

    public Integer insert(Mien mien, MultipartFile img, MultipartFile video);

    /**
     * 修改
     * @param mien
     * @param img
     * @param video
     * @return Integer
     */

    public Integer update(Mien mien,MultipartFile img,MultipartFile video);

    /**
     * 删除
     * @param str
     * @return Integer
     */

    public Integer delete(String str);
}

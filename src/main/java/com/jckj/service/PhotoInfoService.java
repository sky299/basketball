package com.jckj.service;

import com.jckj.model.CourseInfo;
import com.jckj.model.PhotoInfo;
import com.jckj.vo.PageVo;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author 柳江
 * @date 2022/9.1 0:11
 * @describe:
 */

public interface PhotoInfoService {
    /**
     * 查询关于我们
     * @return JaonResult
     */
    public PageVo list();

    /**
     * 销课列表总数
     * @return 总数
     */
    public int count( );

    /**
     * 修改公共休息关于我们
     * @param photoInfo 关于我们实体对象
     * @param img 图片
     * @return 成功条数
     */
    public Integer update(PhotoInfo photoInfo, MultipartFile img);
}
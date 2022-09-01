package com.jckj.service;

import com.jckj.model.CourseInfo;
import com.jckj.model.PhotoInfo;
import com.jckj.vo.PageVo;

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
}

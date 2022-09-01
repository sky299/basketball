package com.jckj.service;

import com.jckj.model.SaltsInfo;
import com.jckj.vo.PageVo;

/**
 * @author 柳江
 * @date 2022/9/1 11:05
 * @describe:
 */
public interface SaltsService {
    /**
     * 销课记录
     * @param saltsInfo 学生id
     * @return PageVo
     */
    public PageVo list(SaltsInfo saltsInfo);

    /**
     * 销课记录总数
     * @param saltsInfo 学生id
     * @return 总数
     */
    public int count(SaltsInfo saltsInfo);
}

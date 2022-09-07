package com.app.service;

import com.jckj.model.SaltsInfo;
import com.jckj.vo.PageVo;

/**
 * @author 小江
 * @date 2022/9/6 16:55
 * @describe:
 */
public interface WxSaltsService {
    /**
     * 销课记录查询
     * @param saltsInfo 学员id
     * @return 记录
     */
    PageVo list(SaltsInfo saltsInfo);

    /**
     * 加课时
     * @param saltsInfo 销课
     * @return 成功条数
     */
    int addSalts(SaltsInfo saltsInfo);

    /**
     * 销课
     * @param saltsInfo 销课
     * @param ids id串
     * @return 成功条数
     */
    int cutSalts(SaltsInfo saltsInfo,String ids);
}

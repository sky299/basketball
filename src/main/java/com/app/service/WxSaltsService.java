package com.app.service;

import com.jckj.model.SaltsInfo;
import com.jckj.vo.PageVo;

/**
 * @author 小江
 * @date 2022/9/6 16:55
 * @describe:
 */
public interface WxSaltsService {
    PageVo list(SaltsInfo saltsInfo);
    int addSalts(SaltsInfo saltsInfo);
}

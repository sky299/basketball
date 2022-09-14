package com.app.service;

import com.jckj.vo.PageVo;

import javax.servlet.http.HttpSession;

/**
 * @author 小江
 * @date 2022/9/13 16:58
 * @describe:
 */
public interface WxOpenService {
    /**
     * 关于我们
     * @return 关于我们
     */
    PageVo findAllPhotoInfo();

    /**
     * 积分福利
     * @return 积分福利
     */
    PageVo findAllOpenIntegral();

    /**
     * 轮播图
     * @return 轮播图
     */
    PageVo findAllOpenRotation();

    /**
     * 更换校区
     * @param session session
     */
    void replaceSchool(HttpSession session,String schoolName);
}

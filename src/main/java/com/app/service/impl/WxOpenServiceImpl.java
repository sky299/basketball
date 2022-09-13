package com.app.service.impl;

import com.app.mapper.WxOpenMapper;
import com.app.service.WxOpenService;
import com.jckj.model.*;
import com.jckj.vo.PageVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author 小江
 * @date 2022/9/13 16:58
 * @describe:
 */
@Service
public class WxOpenServiceImpl implements WxOpenService {
    @Resource
    private WxOpenMapper wxOpenMapper;

    @Override
    public PageVo findAllPhotoInfo() {
        List<PhotoInfo> all = wxOpenMapper.findAllPhotoInfo();
        return PageVo.successPage(all);
    }

    @Override
    public PageVo findAllOpenIntegral() {
        List<OpenIntegral> allOpenIntegral = wxOpenMapper.findAllOpenIntegral();
        return PageVo.successPage(allOpenIntegral);
    }

    @Override
    public PageVo findAllOpenRotation() {
        List<OpenRotation> allOpenProblem = wxOpenMapper.findAllOpenRotation();
        return PageVo.successPage(allOpenProblem);
    }

    @Override
    public void replaceSchool(HttpSession session,String schoolName) {
        session.setAttribute("school",schoolName);
    }
}

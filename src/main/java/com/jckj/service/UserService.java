package com.jckj.service;

import com.jckj.dto.PageDto;
import com.jckj.model.TUserInfo;
import com.jckj.vo.PageVo;

public interface UserService {
    /**
     * 列表
     */
    PageVo list(TUserInfo tUserInfo);

    /**
     * 详情
     */
    TUserInfo info(Integer id);

    /**
     * 新增
     */
    void add(TUserInfo tUserInfo);

    /**
     * 修改
     */
    void update(TUserInfo tUserInfo);

    /**
     * 删除
     */
    void remove(Integer id);

    /**
     * 列表总数
     */
    Integer count(PageDto pageDto);
}

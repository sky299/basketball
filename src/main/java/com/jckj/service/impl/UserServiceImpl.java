package com.jckj.service.impl;

import com.jckj.dto.PageDto;
import com.jckj.mapper.UserMapper;
import com.jckj.model.TUserInfo;
import com.jckj.service.UserService;
import com.jckj.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageVo list(TUserInfo tUserInfo) {
        return PageVo.successPage(userMapper.list(tUserInfo));
    }

    @Override
    public TUserInfo info(Integer id) {
        return userMapper.info(id);
    }

    @Override
    public void add(TUserInfo tUserInfo) {
        tUserInfo.setCreateTime(System.currentTimeMillis());
        tUserInfo.setUpdateTime(System.currentTimeMillis());
        userMapper.add(tUserInfo);
    }

    @Override
    public void update(TUserInfo tUserInfo) {
        tUserInfo.setUpdateTime(System.currentTimeMillis());
        userMapper.update(tUserInfo);
    }

    @Override
    public void remove(Integer id) {
        userMapper.remove(id);
    }

    @Override
    public Integer count(PageDto pageDto) {
        return userMapper.count(pageDto);
    }
}

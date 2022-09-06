package com.jckj.mapper;

import com.jckj.model.PhotoInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 柳江
 * @date 2022/8/31 16:23
 * @describe: 公共模块
 */
@Repository
public interface PhotoInfoMapper {

    /**
     * 查询全部
     * @return  List<PhotoInfo>
     */
    public List<PhotoInfo> findAll();

    /**
     * 总数
     * @return 总数
     */
    public Integer count();

    /**
     * 修改
     * @param photoInfo 关于我们对象
     * @return 成功条数
     */
    public Integer update(PhotoInfo photoInfo);

}

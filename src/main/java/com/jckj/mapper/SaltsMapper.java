package com.jckj.mapper;

import com.jckj.model.SaltsInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/1 10:38
 * @describe: 销课表方法
 */
@Repository
public interface SaltsMapper {
    /**
     * 销课记录
     * @param saltsInfo 学生id
     * @return 学生对象集合
     */
    public List<SaltsInfo> findAll(SaltsInfo saltsInfo);
    /**
     * 销课记录总数
     * @param saltsInfo 学生id
     * @return 总数
     */
    public Integer count(SaltsInfo saltsInfo);
}

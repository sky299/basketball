package com.app.mapper;

import com.jckj.model.Mien;
import com.jckj.model.SaltsInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 小江
 * @date 2022/9/7 10:27
 * @describe:
 */
@Repository
public interface WxSaltsMapper {
    /**
     * 销课记录查询
     * @param saltsInfo 学员id
     * @return 记录
     */
    List<SaltsInfo> findAll(SaltsInfo saltsInfo);
    /**
     * 销课功能
     * @param saltsInfo 销课类型
     * @return 成功条数
     */
    int addSalts(SaltsInfo saltsInfo);

    /**
     * 风采添加
     * @param mien 风采对象
     * @return 成功条数
     */
    int addMien(Mien mien);
}

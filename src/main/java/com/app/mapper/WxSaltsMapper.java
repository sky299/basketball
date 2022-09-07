package com.app.mapper;

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

    public List<SaltsInfo> findAll(SaltsInfo saltsInfo);

    public int addSalts(SaltsInfo saltsInfo);
}

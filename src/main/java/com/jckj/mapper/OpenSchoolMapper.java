package com.jckj.mapper;

import com.jckj.model.OpenSchool;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/2 15:28
 * @describe:
 */
@Repository
public interface OpenSchoolMapper {
    /**
     * 公共校区列表
     * @param openSchool 公共校区对象
     * @return 公共校区集合
     */
    public List<OpenSchool> findAll(OpenSchool openSchool);

    /**
     * 公共校区详情
     * @param openSchool 公共校区对象
     * @return 公共校区对象
     */
    public OpenSchool findById(OpenSchool openSchool);

    /**
     * 公共校区列表总数
     * @param openSchool 公共校区对象
     * @return 总数
     */
    public Integer count(OpenSchool openSchool);

    /**
     * 添加
     * @param openSchool 公共校区对象
     * @return 成功条数
     */
    public int add(OpenSchool openSchool);

    /**
     * 删除
     * @param openSchool 公共校区对象
     * @return 成功条数
     */
    public int delete(OpenSchool openSchool);

    /**
     * 修改
     * @param openSchool 公共校区对象
     * @return 成功条数
     */
    public int update(OpenSchool openSchool);
}

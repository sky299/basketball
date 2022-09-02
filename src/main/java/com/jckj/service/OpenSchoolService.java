package com.jckj.service;

import com.jckj.model.OpenSchool;
import com.jckj.vo.PageVo;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author 柳江
 * @date 2022/9/2 15:25
 * @describe:
 */
public interface OpenSchoolService {
    /**
     * 公共校区列表
     * @param openSchool 公共校区对象
     * @return 公共校区集合
     */
    public PageVo list(OpenSchool openSchool);

    /**
     * 公共校区详情
     * @param openSchool 公共校区对象
     * @return 公共校区对象
     */
    public OpenSchool findById(OpenSchool openSchool);

    /**
     * 公共校区列表总数
     * @param openSchool 公共校区对象
     * @return 公共校区总数
     */
    public int count(OpenSchool openSchool);

    /**
     * 公共校区添加
     * @param openSchool 公共校区对象
     * @param img 图片
     * @return 成功条数
     */
    public int add(OpenSchool openSchool, MultipartFile img);

    /**
     * 公共校区删除
     * @param id 公共校区id
     * @return 成功条数
     */
    public int delete(String id);

    /**
     * 公共校区修改
     * @param openSchool 公共校区对象
     * @param img 图片
     * @return 成功条数
     */
    public int update(OpenSchool openSchool, MultipartFile img);
}

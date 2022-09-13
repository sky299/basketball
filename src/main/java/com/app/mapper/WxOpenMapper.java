package com.app.mapper;

import com.jckj.model.OpenIntegral;
import com.jckj.model.OpenRotation;
import com.jckj.model.PhotoInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 小江
 * @date 2022/9/13 16:59
 * @describe:
 */
@Repository
public interface WxOpenMapper {
    /**
     * 关于我们
     * @return 关于我们
     */
    List<PhotoInfo> findAllPhotoInfo();
    /**
     * 积分福利
     * @return 积分福利
     */
    List<OpenIntegral> findAllOpenIntegral();
    /**
     * 轮播图
     * @return 轮播图
     */
    List<OpenRotation> findAllOpenRotation();
}

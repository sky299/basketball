package com.jckj.service.impl;

import com.jckj.mapper.PhotoInfoMapper;
import com.jckj.model.PhotoInfo;
import com.jckj.service.PhotoInfoService;
import com.jckj.util.QiniuFile;
import com.jckj.vo.PageVo;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * @author 柳江
 * @date 2022/9/1 0:30
 * @describe:
 */
@Service
public class PhotoInfoServiceImpl implements PhotoInfoService {

    @Resource
    private PhotoInfoMapper photoInfoMapper;

    @Override
    public PageVo list() {
        List<PhotoInfo> listPhotoInfo = photoInfoMapper.findAll();
        return PageVo.successPage(listPhotoInfo);
    }

    @Override
    public int count() {
        return photoInfoMapper.count();
    }

    @Override
    public Integer update(PhotoInfo photoInfo, MultipartFile img) {
        try {
            Date date = new Date();
            long time = date.getTime();
            photoInfo.setUpdateTime(time);
            if (img != null) {
                String result = QiniuFile.loadFile(img.getBytes());
                photoInfo.setAbout("http://rhh643m33.hn-bkt.clouddn.com/" + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return photoInfoMapper.update(photoInfo);
    }
}

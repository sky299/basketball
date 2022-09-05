package com.jckj.service;

import com.jckj.vo.JsonResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author: SkLily
 * @date: 2022/9/5 15:13
 * @description:
 */
public interface FileService {
    /***
     * 文件上传
     * @param multipartFile
     * @return JsonResult
     */
    public String uploadFile(MultipartFile multipartFile);
}

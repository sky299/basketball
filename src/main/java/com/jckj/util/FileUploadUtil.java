package com.jckj.util;

/**
 * @author: SkLily
 * @date: 2022/9/1 17:16
 * @description:
 */

import com.google.gson.Gson;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;


public class FileUploadUtil {
    public static String fileUploadToQiNiu(byte[] bytes,String imgname) {
        // 构造一个带指定Zone对象的配置类
        Configuration cfg = new Configuration(Zone.zone2());
        // ...其他参数参考类注释
        UploadManager uploadManager = new UploadManager(cfg);
        // ...生成上传凭证，然后准备上传
        String accessKey = "JYBidASmMu_GDGs9tvxABsguvmC18UOF42XAYnU7";
        String secretKey = "aFfo18JHLS1FCKjPsC0vFJPbkuAgFWKlborw0cUp";
        String bucket = "wsdaren";

        // 如果是Windows情况下，格式是 D:\\qiniu\\test.png
        //        String localFilePath = uploadFile;
        // 默认不指定key的情况下，以文件内容的hash值作为文件名
        String key = imgname;
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        try {
            Response response = uploadManager.put(bytes, key, upToken);
            // 解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(),
                    DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
        } catch (Exception ex) {
            return "error";
        }
        return "上传成功";
    }
}




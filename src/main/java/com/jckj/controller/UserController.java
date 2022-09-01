package com.jckj.controller;

import com.jckj.model.TUserInfo;
import com.jckj.service.UserService;
import com.jckj.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("page/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("list")
    public JsonResult list(TUserInfo tUserInfo) {
        return JsonResult.success(userService.list(tUserInfo).getList(), userService.count(tUserInfo));
    }

    @PostMapping("remove")
    public JsonResult remove(Integer id) {
        userService.remove(id);
        return JsonResult.success();
    }

    @PostMapping("update")
    public JsonResult update(@RequestBody TUserInfo tUserInfo) throws IOException {
        userService.update(tUserInfo);
        return JsonResult.success();
    }

    @PostMapping("add")
    public JsonResult add(TUserInfo tUserInfo, @RequestParam("photo") MultipartFile photo) throws IOException {
        if (photo != null) {
            String photoName = UUID.randomUUID() + "_" + photo.getOriginalFilename();
            int hashCode = photo.hashCode();
            String dir = Integer.toHexString(hashCode);
            String path = "E:/upload/" + dir.charAt(0) + "/" + dir.charAt(1) + "/" + photoName;
            photo.transferTo(new File(path));
            tUserInfo.setUserPhoto(dir.charAt(0) + "/" + dir.charAt(1) + "/" + photoName);
        }
        userService.add(tUserInfo);
        return JsonResult.success();
    }

    @PostMapping("bathDelete")
    public JsonResult bathDelete(String id){
        String[] split = id.split(",");
        for (String s : split) {
            userService.remove(Integer.parseInt(s));
        }
        return JsonResult.success();
    }
}

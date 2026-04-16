package com.leyou.upload.service;


import org.springframework.web.multipart.MultipartFile;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/16 17:36
 */

public interface UploadService {

    String upload(MultipartFile file);
}

package com.leyou.user.utils;


import org.apache.commons.lang.StringUtils;
import org.apache.commons.codec.digest.DigestUtils;
import java.util.UUID;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/21 9:24
 */
public class CodecUtils {

    public static String md5Hex(String data, String salt) {
        if (StringUtils.isBlank(salt)) {
            salt = data.hashCode() + "";
        }
        return DigestUtils.md5Hex(salt + DigestUtils.md5Hex(data));
    }

    public static String shaHex(String data, String salt) {
        if (StringUtils.isBlank(salt)) {
            salt = data.hashCode() + "";
        }
        return DigestUtils.sha512Hex(salt + DigestUtils.sha512Hex(data));
    }

    public static String generateSalt() {
        return StringUtils.replace(UUID.randomUUID().toString(), "-", "");
    }
}

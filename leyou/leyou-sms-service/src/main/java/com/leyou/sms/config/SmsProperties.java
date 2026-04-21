package com.leyou.sms.config;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/21 10:55
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "leyou.sms")
public class SmsProperties {

    // accessKeyId
    public String accessKeyId;
    // AccessKeySecret
    public String accessKeySecret;
    // 签名名称
    public String signName;
    // 模板名称
    public String verifyCodeTemplate;
}

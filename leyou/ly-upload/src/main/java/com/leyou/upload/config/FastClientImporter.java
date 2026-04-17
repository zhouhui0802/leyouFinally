package com.leyou.upload.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableMBeanExport;
import org.springframework.context.annotation.Import;
import org.springframework.jmx.support.RegistrationPolicy;
import com.github.tobato.fastdfs.FdfsClientConfig;
/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/17 7:58
 */

@Configuration
@Import(FdfsClientConfig.class)
// 解决jmx重复注册bean的问题
@EnableMBeanExport(registration = RegistrationPolicy.IGNORE_EXISTING)
public class FastClientImporter {
}

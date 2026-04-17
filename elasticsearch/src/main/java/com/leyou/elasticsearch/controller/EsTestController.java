package com.leyou.elasticsearch.controller;


import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.core.MainResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/17 17:06
 */
@RestController
public class EsTestController {

    // 直接注入这个客户端
    @Autowired
    private RestHighLevelClient restHighLevelClient;

    @GetMapping("/es/test")
    public String testEs() {
        try {
            // 获取 ES 信息
            MainResponse response = restHighLevelClient.info(RequestOptions.DEFAULT);
            return "ES 连接成功！集群名称：" + response.getClusterName();
        } catch (Exception e) {
            return "ES 连接失败：" + e.getMessage();
        }
    }
}

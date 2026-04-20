package com.leyou.rabbitmq.util;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/20 17:10
 */
public class ConnectionUtil {

    /**
     * 建立与RabbitMQ的连接
     * @return
     * @throws Exception
     */
    public static Connection getConnection() throws Exception {
        //定义连接工厂
        ConnectionFactory factory = new ConnectionFactory();
        //设置服务地址
        factory.setHost("127.0.0.1");
        //端口
        factory.setPort(5672);
        //设置账号信息，用户名、密码、vhost
        factory.setVirtualHost("/");  //windows上的配置，不需要虚拟主机
        factory.setUsername("guest");
        factory.setPassword("guest");
        // 通过工程获取连接
        Connection connection = factory.newConnection();
        return connection;
    }
}

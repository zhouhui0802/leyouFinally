package com.leyou.test;


import com.leyou.auth.entity.UserInfo;
import com.leyou.auth.utils.JwtUtils;
import com.leyou.auth.utils.RsaUtils;
import org.junit.Before;
import org.junit.Test;

import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/21 13:54
 */
public class JwtTest {

    private static final String pubKeyPath = "D:\\logs\\rsa.pub";

    private static final String priKeyPath = "D:\\logs\\rsa.pri";

    private PublicKey publicKey;

    private PrivateKey privateKey;

    @Test
    public void testRsa() throws Exception {
        RsaUtils.generateKey(pubKeyPath, priKeyPath, "234");
    }

    @Before
    public void testGetRsa() throws Exception {
        this.publicKey = RsaUtils.getPublicKey(pubKeyPath);
        this.privateKey = RsaUtils.getPrivateKey(priKeyPath);
    }

    @Test
    public void testGenerateToken() throws Exception {
        // 生成token
        String token = JwtUtils.generateToken(new UserInfo(20L, "jack"), privateKey, 5);
        System.out.println("token = " + token);
    }

    @Test
    public void testParseToken() throws Exception {
        String token = "eyJhbGciOiJSUzI1NiJ9.eyJpZCI6MjAsInVzZXJuYW1lIjoiamFjayIsImV4cCI6MTc3Njc1MTg4OX0.JUVZ5BACwkt6R1ng73oDDz75GyfpU1l6JdrV2iZKOGbEAwVqZMY0CYGmyCpd-06K17OU0uGugKyUxlPBblrKoAoIuaQMAtNDP8UBEr_RDTwX3tMnBqBX1r7GOB5Nh1J_SjZY4eQU56MLV9ojd6b9KqTGPZ5gs2FbSiuLwYOvt9s";

        // 解析token
        UserInfo user = JwtUtils.getInfoFromToken(token, publicKey);
        System.out.println("id: " + user.getId());
        System.out.println("userName: " + user.getUsername());
    }
}

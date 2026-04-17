package com.leyou.elasticsearch.service;


import com.leyou.elasticsearch.pojo.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/17 18:11
 */
@Repository
public interface UserRepository extends ElasticsearchRepository<User, Long> {

    // 按名称查询
    List<User> findByName(String name);
}

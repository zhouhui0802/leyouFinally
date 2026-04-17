package com.leyou.elasticsearch.controller;


import com.leyou.elasticsearch.service.UserRepository;
import lombok.RequiredArgsConstructor;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.Criteria;
import org.springframework.data.elasticsearch.core.query.CriteriaQuery;
import org.springframework.web.bind.annotation.*;
import com.leyou.elasticsearch.pojo.User;

import java.util.Optional;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/17 18:13
 */
@RestController
@RequestMapping("/es/user")
@RequiredArgsConstructor
public class EsUserController {
    private final UserRepository userRepository;
    private final ElasticsearchRestTemplate restTemplate;
    private final RestHighLevelClient client;

    // 1. 新增/更新
    @PostMapping("/save")
    public User save(@RequestBody User user) {
        return userRepository.save(user);
    }

    // 2. 根据ID查询
    @GetMapping("/get/{id}")
    public Optional<User> getById(@PathVariable Long id) {
        return userRepository.findById(id);
    }

    // 3. 查询所有
    @GetMapping("/list")
    public Iterable<User> list() {
        return userRepository.findAll();
    }

    // 4. 根据ID删除
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "删除成功";
    }

    // 5. 条件查询（年龄 >= ?）
    @GetMapping("/search/age")
    public SearchHits<User> searchByAge(@RequestParam Integer age) {
        Criteria criteria = Criteria.where("age").greaterThanEqual(age);
        CriteriaQuery query = new CriteriaQuery(criteria);
        return restTemplate.search(query, User.class);
    }

    // 6. 按名称精确查询
    @GetMapping("/search/name")
    public Iterable<User> searchByName(@RequestParam String name) {
        return userRepository.findByName(name);
    }

}

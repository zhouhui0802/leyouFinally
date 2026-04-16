package com.leyou.item.controller;


import com.leyou.item.pojo.Category;
import com.leyou.item.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/16 13:31
 */
@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 根据parentId查询类目
     * @param pid
     * @return
     */
    @RequestMapping("list")   //一般来说，会使用 @GetMapping("/list")    // 查询 @PostMapping("/add")   // 新增 @PutMapping("/update") // 修改 @DeleteMapping("/del") // 删除
    public ResponseEntity<List<Category>> queryCategoryListByParentId(@RequestParam(value = "pid", defaultValue = "0") Long pid) {
        try {
            if (pid == null || pid.longValue() < 0){
                // pid为null或者小于等于0，响应400
                return ResponseEntity.badRequest().build();
            }
            // 执行查询操作
            List<Category> categoryList = this.categoryService.queryCategoryListByParentId(pid);
            if (CollectionUtils.isEmpty(categoryList)){
                // 返回结果集为空，响应404
                return ResponseEntity.notFound().build();
            }
            // 响应200
            return ResponseEntity.ok(categoryList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 响应500
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }
}

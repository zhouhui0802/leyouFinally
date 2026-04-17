package com.leyou.item.service;


import com.leyou.item.pojo.Category;

import java.util.List;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/16 13:35
 */

public interface CategoryService {

    public List<Category> queryCategoryListByParentId(Long pid);

    public List<Category> queryByBrandId(Long bid);

    public List<String> queryNameByIds(List<Long> ids);
}

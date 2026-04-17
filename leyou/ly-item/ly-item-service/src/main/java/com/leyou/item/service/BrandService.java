package com.leyou.item.service;


import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.Brand;

import java.util.List;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/16 15:14
 */

public interface BrandService {

    public PageResult<Brand> queryBrandByPageAndSort(
            Integer page, Integer rows, String sortBy, Boolean desc, String key);

    public void saveBrand(Brand brand, List<Long> cids);

    public List<Brand> queryBrandByCategory(Long cid);
}

package com.leyou.item.service;


import com.leyou.common.pojo.PageResult;
import com.leyou.item.pojo.*;

import java.util.List;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/17 9:00
 */

public interface GoodsService {

    public PageResult<SpuBo> querySpuByPageAndSort(Integer page, Integer rows, String key, Boolean saleable);

    public void save(SpuBo spu);

    public SpuDetail querySpuDetailById(Long id);

    public List<Sku> querySkuBySpuId(Long spuId);

    public void update(SpuBo spu);

    public SpuDetail querySpuDetailBySpuId(Long spuId);

    /**
     * 查询sku根据id
     * @param id
     * @return
     */
    Sku querySkuById(Long id);

}

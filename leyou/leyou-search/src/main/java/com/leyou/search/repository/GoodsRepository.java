package com.leyou.search.repository;


import com.leyou.search.pojo.Goods;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/18 9:42
 */

public interface GoodsRepository extends ElasticsearchRepository<Goods, Long> {
}

package com.leyou.search.service;


import com.leyou.item.pojo.Spu;
import com.leyou.search.pojo.Goods;
import com.leyou.search.pojo.SearchRequest;
import com.leyou.search.pojo.SearchResult;

import java.io.IOException;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/18 9:51
 */

public interface SearchService {

    public Goods buildGoods(Spu spu) throws IOException;

   /* public SearchResult search(SearchRequest request);*/

    public SearchResult search(SearchRequest request);
}

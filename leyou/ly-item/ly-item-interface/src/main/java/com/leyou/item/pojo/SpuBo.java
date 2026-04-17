package com.leyou.item.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Transient;
import java.util.List;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/17 8:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpuBo extends Spu{

    @Transient  //这个字段不是数据库表字段，不要映射、不要存库、不要查。
    String cname;// 商品分类名称
    @Transient
    String bname;// 品牌名称
    @Transient
    SpuDetail spuDetail;// 商品详情
    @Transient
    List<Sku> skus;// sku列表
}

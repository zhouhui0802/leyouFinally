package com.leyou.item.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/17 11:01
 */
@Table(name = "tb_stock")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {

    @Id
    private Long skuId;
    private Integer seckillStock;// 秒杀可用库存
    private Integer seckillTotal;// 已秒杀数量
    private Integer stock;// 正常库存
}

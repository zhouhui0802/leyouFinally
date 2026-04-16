package com.leyou.common.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/16 15:11
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageResult<T> {

    private Long total;// 总条数
    private Long totalPage;// 总页数
    private List<T> items;// 当前页数据

    public PageResult(Long total, List<T> items) {
        this.total = total;
        this.items = items;
    }

}

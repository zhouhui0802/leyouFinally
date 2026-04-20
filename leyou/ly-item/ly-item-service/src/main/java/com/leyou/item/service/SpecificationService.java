package com.leyou.item.service;


import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;
import com.leyou.item.pojo.Specification;

import java.util.List;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/17 8:36
 */

public interface SpecificationService {

    public Specification queryById(Long id);

    public List<SpecParam> querySpecParams(Long gid, Long cid, Boolean searching, Boolean generic);

    /*public List<SpecGroup> querySpecsByCid(Long cid);*/
}

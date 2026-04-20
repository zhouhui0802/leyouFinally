package com.leyou.item.service.impl;


import com.leyou.item.mapper.SpecParamMapper;
import com.leyou.item.mapper.SpecificationMapper;
import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;
import com.leyou.item.pojo.Specification;
import com.leyou.item.service.SpecificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouhui
 * @version 1.0
 * @description TODO
 * @date 2026/4/17 8:37
 */
@Service
public class SpecificationServiceImpl implements SpecificationService {

    @Autowired
    private SpecParamMapper specParamMapper;

    @Autowired
    private SpecificationMapper specificationMapper;

    public Specification queryById(Long id) {
        return this.specificationMapper.selectByPrimaryKey(id);
    }

    public List<SpecParam> querySpecParams(Long gid, Long cid, Boolean searching, Boolean generic) {
        SpecParam param = new SpecParam();
        param.setGroupId(gid);
        param.setCid(cid);
        param.setSearching(searching);
        param.setGeneric(generic);
        return this.specParamMapper.select(param);
    }

/*    public List<SpecGroup> querySpecsByCid(Long cid) {
        // 查询规格组
        List<SpecGroup> groups = this.querySpecGroups(cid);
        SpecParam param = new SpecParam();
        groups.forEach(g -> {
            // 查询组内参数
            g.setParams(this.querySpecParams(g.getId(), null, null, null));
        });
        return groups;
    }*/
}

package com.bake.demo.service.impl;

import com.bake.demo.model.Bed;
import com.bake.demo.mapper.BedMapper;
import com.bake.demo.model.HouseAndBed;
import com.bake.demo.service.BedService;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 床 服务实现类
 * </p>
 *
 * @author yan
 * @since 2019-05-27
 */
@Service
public class BedServiceImpl extends ServiceImpl<BedMapper, Bed> implements BedService {

    @Override
    public Page<Bed> queryPageNew(Page page) {
        List<Bed> bedList = baseMapper.queryAllBed(page);
        return page.setRecords(bedList);
    }

    @Override
    public List<HouseAndBed> queryAll() {
        return baseMapper.queryAll();
    }

    @Override
    public List<Bed> queryTest() {
        return baseMapper.queryTest();
    }
}

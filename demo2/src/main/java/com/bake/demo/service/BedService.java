package com.bake.demo.service;

import com.bake.demo.model.Bed;
import com.bake.demo.model.HouseAndBed;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 床 服务类
 * </p>
 *
 * @author yan
 * @since 2019-05-27
 */
public interface BedService extends IService<Bed> {

    Page<Bed> queryPageNew(Page page);

    List<HouseAndBed> queryAll();

    List<Bed> queryTest();
}

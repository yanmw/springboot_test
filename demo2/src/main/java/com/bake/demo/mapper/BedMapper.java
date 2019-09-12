package com.bake.demo.mapper;

import com.bake.demo.model.Bed;
import com.bake.demo.model.HouseAndBed;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 床 Mapper 接口
 * </p>
 *
 * @author yan
 * @since 2019-05-27
 */
public interface BedMapper extends BaseMapper<Bed> {

    List<Bed> queryAllBed(Pagination page);

    List<HouseAndBed> queryAll();

    List<Bed> queryTest();

}

package com.bake.demo.service.impl;

import com.bake.demo.model.House;
import com.bake.demo.mapper.HouseMapper;
import com.bake.demo.service.HouseService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 房子 服务实现类
 * </p>
 *
 * @author yan
 * @since 2019-05-27
 */
@Service
public class HouseServiceImpl extends ServiceImpl<HouseMapper, House> implements HouseService {

}

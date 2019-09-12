package com.bake.demo.service.impl;

import com.bake.demo.model.Phone;
import com.bake.demo.mapper.PhoneMapper;
import com.bake.demo.service.PhoneService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 普通账户下绑定的话机 服务实现类
 * </p>
 *
 * @author yan
 * @since 2019-05-27
 */
@Service
public class PhoneServiceImpl extends ServiceImpl<PhoneMapper, Phone> implements PhoneService {

}

package com.test.demo.repository;

import com.test.demo.core.HouseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/15 11:15
 */
public interface HouseReprository extends JpaRepository<HouseEntity,Integer> {
    
}

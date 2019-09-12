package com.test.demo.repository;

import com.test.demo.core.BedEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/15 11:14
 */
public interface BedReprository extends JpaRepository<BedEntity,Integer> {
    @Query("select b from BedEntity b where b.length = :length")
    List<BedEntity> getAllByLength(@Param("length") String length);


}

package com.test.demo.repository;

import com.test.demo.core.BedAndHouse;
import com.test.demo.core.BedEntity;
import com.test.demo.core.HouseAndBed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/15 15:20
 */
public interface HouseAndBedReprository extends JpaRepository<BedEntity,Integer> {
    @Query("select new com.test.demo.core.HouseAndBed( h,b ) from BedEntity b left join HouseEntity h on b.houseId = h.houseId")
    List<HouseAndBed> getHouseAndBedByBedId();

    @Query("select new com.test.demo.core.BedAndHouse(b.bedId,b.length,b.wide,h.houseId,h.price,h.price) from BedEntity  b left join HouseEntity  h on b.houseId = h.houseId where h.houseId = :houseId")
    List<BedAndHouse> getBedAndHouse(@Param("houseId") Integer houseId);

    @Query("select new com.test.demo.core.BedAndHouse(h.houseId,h.price,h.area,count(b.bedId)) from BedEntity b left join HouseEntity h on b.houseId = h.houseId where h.houseId = :houseId group by h.houseId,h.price,h.area")
    List<BedAndHouse> getBedNumInHouse(@Param("houseId") Integer houseId);
}

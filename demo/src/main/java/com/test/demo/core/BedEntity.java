package com.test.demo.core;

import javax.persistence.*;
import java.util.Objects;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/15 11:11
 */
@Entity
@Table(name = "bed", schema = "test", catalog = "")
public class BedEntity {
    private int bedId;
    private String length;
    private String wide;
    private Integer houseId;

    @Id
    @Column(name = "bed_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getBedId() {
        return bedId;
    }

    public void setBedId(int bedId) {
        this.bedId = bedId;
    }

    @Basic
    @Column(name = "length", nullable = true, length = 100)
    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    @Basic
    @Column(name = "wide", nullable = true, length = 100)
    public String getWide() {
        return wide;
    }

    public void setWide(String wide) {
        this.wide = wide;
    }

    @Column(name = "house_id", nullable = true)
    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BedEntity bedEntity = (BedEntity) o;
        return bedId == bedEntity.bedId &&
                Objects.equals(length, bedEntity.length) &&
                Objects.equals(wide, bedEntity.wide) &&
                Objects.equals(houseId, bedEntity.houseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bedId, length, wide, houseId);
    }
}

package com.test.demo.core;

import javax.persistence.*;
import java.util.Objects;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/15 11:11
 */
@Entity
@Table(name = "house", schema = "test", catalog = "")
public class HouseEntity {
    private int houseId;
    private String price;
    private String area;

    @Id
    @Column(name = "house_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    @Basic
    @Column(name = "price", nullable = true, length = 100)
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Basic
    @Column(name = "area", nullable = true, length = 100)
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HouseEntity that = (HouseEntity) o;
        return houseId == that.houseId &&
                Objects.equals(price, that.price) &&
                Objects.equals(area, that.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseId, price, area);
    }
}

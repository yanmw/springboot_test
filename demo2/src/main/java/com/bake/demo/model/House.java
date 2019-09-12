package com.bake.demo.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 房子
 * </p>
 *
 * @author yan
 * @since 2019-05-27
 */
public class House implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 房子id
     */
    @TableId(value = "house_id", type = IdType.AUTO)
    private Integer houseId;
    /**
     * 单价
     */
    private String price;
    /**
     * 面积
     */
    private String area;


    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "House{" +
        ", houseId=" + houseId +
        ", price=" + price +
        ", area=" + area +
        "}";
    }
}

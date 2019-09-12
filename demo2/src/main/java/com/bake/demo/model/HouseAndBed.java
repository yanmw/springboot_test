package com.bake.demo.model;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/27 16:23
 */
public class HouseAndBed {

    private Integer bedId;
    /**
     * 长
     */
    private String length;
    /**
     * 宽
     */
    private String wide;

    private Integer houseId;
    /**
     * 单价
     */
    private String price;
    /**
     * 面积
     */
    private String area;

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWide() {
        return wide;
    }

    public void setWide(String wide) {
        this.wide = wide;
    }

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
}

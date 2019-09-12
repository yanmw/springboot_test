package com.test.demo.core;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/16 10:06
 */
public class BedAndHouse {
    private int bedId;
    private String length;
    private String wide;
    private int houseId;
    private String price;
    private String area;
    private long countBed;
    public BedAndHouse(int bedId, String length, String wide, int houseId, String price, String area) {
        super();
        this.bedId = bedId;
        this.length = length;
        this.wide = wide;
        this.houseId = houseId;
        this.price = price;
        this.area = area;
    }

    public BedAndHouse(int houseId, String price, String area, long countBed) {
        this.houseId = houseId;
        this.price = price;
        this.area = area;
        this.countBed = countBed;
    }

    public long getCountBed() {
        return countBed;
    }

    public void setCountBed(long countBed) {
        this.countBed = countBed;
    }

    public int getBedId() {
        return bedId;
    }

    public void setBedId(int bedId) {
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

    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
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

package com.bake.demo.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 床
 * </p>
 *
 * @author yan
 * @since 2019-05-27
 */
public class Bed implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 床id
     */
    @TableId(value = "bed_id", type = IdType.AUTO)
    private Integer bedId;
    /**
     * 长
     */
    private String length;
    /**
     * 宽
     */
    private String wide;
    /**
     * 房子id
     */
    private Integer houseId;


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

    @Override
    public String toString() {
        return "Bed{" +
        ", bedId=" + bedId +
        ", length=" + length +
        ", wide=" + wide +
        ", houseId=" + houseId +
        "}";
    }
}

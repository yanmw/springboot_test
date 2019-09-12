package com.bake.demo.model;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import java.io.Serializable;

/**
 * <p>
 * 普通账户下绑定的话机
 * </p>
 *
 * @author yan
 * @since 2019-05-27
 */
public class Phone implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 话机id
     */
    @TableId(value = "phone_id", type = IdType.AUTO)
    private Integer phoneId;
    /**
     * 账户id
     */
    private Integer accountId;
    /**
     * 话机号
     */
    private String phone;
    /**
     * 用户id
     */
    private Integer memId;
    /**
     * 密码
     */
    private String password;


    public Integer getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Integer phoneId) {
        this.phoneId = phoneId;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getMemId() {
        return memId;
    }

    public void setMemId(Integer memId) {
        this.memId = memId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Phone{" +
        ", phoneId=" + phoneId +
        ", accountId=" + accountId +
        ", phone=" + phone +
        ", memId=" + memId +
        ", password=" + password +
        "}";
    }
}

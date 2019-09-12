package com.ceshishi.demo1.core;

import javax.persistence.*;
import java.util.Date;

@Table(name = "CUSTOMER")
@Entity
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "CUSTOMER_ID",columnDefinition = "int(11) COMMENT '客户id'")
    private Integer customerId;

    @Column(name = "NAME",length = 64,columnDefinition = "varchar(64) COMMENT '姓名'")
    private String name;

    @Column(columnDefinition = "varchar(4) COMMENT '性别'")
    private String sex;

    @Column(name = "NICK_NAME",columnDefinition = "varchar(128) COMMENT '昵称'")
    private String nickName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "LAST_MODIFY_DATE",columnDefinition = "TIMESTAMP COMMENT '最后修改时间'")
    private Date lastModifyDate;

    @Temporal(TemporalType.DATE)
    @Column(columnDefinition = "DATE COMMENT '生日'")
    private Date birth;

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", nickName='" + nickName + '\'' +
                ", lastModifyDate=" + lastModifyDate +
                ", birth=" + birth +
                '}';
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    //工具方法，不需要映射为数据表的一列
    @Transient
    public String getInfo(){
        return customerId+sex;
    }
}

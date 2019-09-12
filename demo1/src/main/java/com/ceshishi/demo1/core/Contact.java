package com.ceshishi.demo1.core;

import javax.persistence.*;

@Table(name = "CONTACT")
@Entity
public class Contact {

    @Id
    @GeneratedValue
    @Column(name = "CONTACT_ID",columnDefinition = "int(11) COMMENT '联系人id'")
    private Integer contactId;

    @Column(columnDefinition = "varchar(32) COMMENT '电话号码'")
    private String mobile;

    //映射多对一，使用ManyToOne来维持关系，使用JoinColumn来映射外键，name属性来绑定外键字段
    @ManyToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    @Override
    public String toString() {
        return "Contact{" +
                "contactId=" + contactId +
                ", mobile='" + mobile + '\'' +
                ", customer=" + customer +
                '}';
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}

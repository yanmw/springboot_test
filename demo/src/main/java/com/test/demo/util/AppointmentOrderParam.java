package com.test.demo.util;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/17 10:06
 */
public class AppointmentOrderParam {
    private Integer id;
    private String name;
    private String sex;

    @Override
    public String toString() {
        return "AppointmentOrderParam{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
}

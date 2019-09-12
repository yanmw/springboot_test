package com.test.demo.core;

import javax.persistence.*;

@Entity
@Table(name = "d_dog")//如果省略默认是类名小写dog
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer id;
    @Column(name = "sex1",length = 100)//不写默认就是属性名
    private String sex;

//    @Override
//    public String toString() {
//        return "Dog{" +
//                "id=" + id +
//                ", sex='" + sex + '\'' +
//                '}';
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

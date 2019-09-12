package com.test.demo.core;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/09 11:33
 */
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {
    @NotNull
    private String name;
    private Integer age;
    private Boolean rich;
    private Date birthday;
    private List<Object> list;
    private Map<String,Object> map;
    private Pet pet;

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", rich=" + rich +
//                ", birthday=" + birthday +
//                ", list=" + list +
//                ", map=" + map +
//                ", pet=" + pet +
//                '}';
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getRich() {
        return rich;
    }

    public void setRich(Boolean rich) {
        this.rich = rich;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public Map<String, Object> getMap() {
        return map;
    }

    public void setMap(Map<String, Object> map) {
        this.map = map;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}

package com.test.demo.core;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/09 11:45
 */
public class Pet {
    private String dog;
    private String cat;

//    @Override
//    public String toString() {
//        return "Pet{" +
//                "dog='" + dog + '\'' +
//                ", cat='" + cat + '\'' +
//                '}';
//    }

    public String getDog() {
        return dog;
    }

    public void setDog(String dog) {
        this.dog = dog;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
}

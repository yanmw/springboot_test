package com.test.demo.core;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @创建人: 闫明伟
 * @描述:
 * @创建时间 2019/05/09 12:38
 */
@Component
@PropertySource(value = "classpath:shop.properties")
@ConfigurationProperties(prefix = "shop")
public class Shop {
    private String food;

//    @Override
//    public String toString() {
//        return "Shop{" +
//                "food='" + food + '\'' +
//                '}';
//    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}

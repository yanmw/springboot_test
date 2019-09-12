package com.test.demo.config;

import com.test.demo.service.DemoService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @创建人: 闫明伟
 * @描述:@Configuration:告诉spring boot这是一个配置类
 * @创建时间 2019/05/09 13:04
 */
@Configuration
public class DemoConfig {

    @Bean
    public DemoService demoService(){
        return new DemoService();
    }
}

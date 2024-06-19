package com.chuck.springcloud.conf;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: study
 * @BelongsPackage: com.chuck.springcloud.conf
 * @Author: 上青天
 * @CreateTime: 2024-06-19  10:07
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}

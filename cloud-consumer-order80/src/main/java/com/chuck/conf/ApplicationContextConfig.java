package com.chuck.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @BelongsProject: study
 * @BelongsPackage: com.chuck.conf
 * @Author: 上青天
 * @CreateTime: 2024-06-14  14:26
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

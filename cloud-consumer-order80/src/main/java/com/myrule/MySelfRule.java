package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: study
 * @BelongsPackage: com.myrule
 * @Author: 上青天
 * @CreateTime: 2024-06-19  13:31
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        return new RandomRule();//定义为随机
    }
}

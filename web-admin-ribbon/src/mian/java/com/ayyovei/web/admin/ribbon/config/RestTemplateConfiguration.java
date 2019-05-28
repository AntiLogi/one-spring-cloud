package com.ayyovei.web.admin.ribbon.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/5/28
 */
@Configuration
public class RestTemplateConfiguration {
    /**
     * @LoadBalanced 会负载的访问服务提供者
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

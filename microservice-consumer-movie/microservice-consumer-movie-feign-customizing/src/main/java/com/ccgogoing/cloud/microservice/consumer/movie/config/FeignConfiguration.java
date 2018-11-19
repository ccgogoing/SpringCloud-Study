package com.ccgogoing.cloud.microservice.consumer.movie.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 描述:
 * Feign 配置类
 * 注意: 不应该在主应用程序上下文的@ComponentScan中,否则该类中的配置信息就会被所有的@FeignClient共享;
 * 因此,如果只想自定义某个Feign客户端,必须防止@Configuration 注解的类所在的包与ComponentScan扫描的包重叠,
 * 或应显示指定@ComponentScan不扫描@Configuration所在的包
 * @outhor chong
 * @create 2018-09-12 22:51
 */
@Configuration
public class FeignConfiguration {

    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }
}

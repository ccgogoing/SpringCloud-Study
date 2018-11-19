package com.ccgogoing.cloud.microservice.consumer.movie.util;

import com.ccgogoing.cloud.microservice.consumer.movie.config.FeignConfiguration;
import com.ccgogoing.cloud.microservice.consumer.movie.pojo.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(name = "microservice-provider-user",configuration = FeignConfiguration.class)
public interface UserFeignClient {

    /**
     * 使用feign自带的注解@RequestLine
     * @param id
     * @return
     */
    @RequestLine("GET /{id}")
    User findById(@Param("id") Long id) ;
}

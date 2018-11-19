package com.ccgogoing.cloud.microservice.consumer.movie.util;

import com.ccgogoing.cloud.microservice.consumer.movie.pojo.User;
import com.ccgogoing.cloud.microservice.consumer.movie.util.impl.FeignClientFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Feign 的fallback 测试
 * 使用@FeignClient的fallback的属性指定回退类
 */
@FeignClient(name = "microservice-provider-user", fallback = FeignClientFallBack.class)
public interface UserFeignClient {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    User findById(@PathVariable("id") Long id) ;
}

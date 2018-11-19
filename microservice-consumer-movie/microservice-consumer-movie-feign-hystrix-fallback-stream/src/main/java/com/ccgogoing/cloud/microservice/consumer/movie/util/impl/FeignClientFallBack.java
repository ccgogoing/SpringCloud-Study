package com.ccgogoing.cloud.microservice.consumer.movie.util.impl;

import com.ccgogoing.cloud.microservice.consumer.movie.pojo.User;
import com.ccgogoing.cloud.microservice.consumer.movie.util.UserFeignClient;
import org.springframework.stereotype.Component;

/**
 * 描述:
 * 回退类FeignClientFallback需实现FeignClient接口
 *
 * @outhor chong
 * @create 2018-09-23 19:34
 */
@Component
public class FeignClientFallBack implements UserFeignClient{

    @Override
    public User findById(Long id) {
        User user= new User();
        user.setId(-1L);
        user.setUsername("默认用户");
        return user;
    }
}

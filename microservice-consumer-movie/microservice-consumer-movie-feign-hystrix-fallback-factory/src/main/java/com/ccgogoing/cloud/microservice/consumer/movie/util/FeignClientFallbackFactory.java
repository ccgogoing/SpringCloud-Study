package com.ccgogoing.cloud.microservice.consumer.movie.util;

import com.ccgogoing.cloud.microservice.consumer.movie.pojo.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * 描述:
 * UserFeignClient的facllbackFactory类，该类需实现FallbackFactory接口，并重写create方法
 *
 * @outhor chong
 * @create 2018-09-24 20:36
 */
@Component
public class FeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {

    private static final Logger LOGGER = LoggerFactory.getLogger(FeignClientFallbackFactory.class);

    @Override
    public UserFeignClient create(Throwable throwable) {
        return new UserFeignClient() {
            @Override
            public User findById(Long id) {
                /**
                 * 日志最好放在各个fallback方法中，而不要直接放在create方法中
                 * 否则在引用启动时，就会打印该日志。
                 */
                FeignClientFallbackFactory.LOGGER.info("fallback; reason was: ", throwable);
                User user = new User();
                if (throwable instanceof IllegalArgumentException) {
                    user.setId(-1L);
                } else {
                    user.setId(-2L);
                }
                user.setId(-1L);
                user.setUsername("默认用户");
                return user;
            }
        };
    }
}

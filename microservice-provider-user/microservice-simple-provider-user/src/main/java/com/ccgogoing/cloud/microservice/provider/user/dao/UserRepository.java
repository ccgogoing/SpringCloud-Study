package com.ccgogoing.cloud.microservice.provider.user.dao;

import com.ccgogoing.cloud.microservice.provider.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 描述:
 *
 * @outhor chong
 * @create 2018-08-01 23:34
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{


}

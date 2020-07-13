package com.springboot.seckil.redis;

import com.springboot.seckil.model.UserTest;
import org.springframework.stereotype.Service;

@Service
public class UserRedis extends IRedisDao<UserTest> {
    protected static final String REDIS_KEY = "com.springboot.seckil.redis.UserRedis";
    @Override
    protected String getRedisKey() {
        return REDIS_KEY;
    }

}

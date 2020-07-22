package com.springboot.seckil.redis;

import com.springboot.seckil.model.Course;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRedis extends BaseRedis<Course>{

    private static final String REDIS_KEY = "com.springboot.seckil.redis.CourseRedis";

    @Override
    protected String getRedisKey() {
        return REDIS_KEY;
    }

}

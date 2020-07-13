package com.springboot.seckil.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * 编写公共类，定义Redis公共的抽象类来完成一些常规操作
 * @param <T>
 */
public abstract class IRedisDao<T> {
    @Autowired
    protected RedisTemplate<String,Object> redisTemplate;
    @Resource
    protected HashOperations<String,String,T> hashOperations;

    /**
     * 存入redis的key 这个key是整个打key
     * @return
     */
    protected abstract String getRedisKey();
    public void put (String key,T domain,long expire){
        hashOperations.put(getRedisKey(),key,domain);
        if(expire!= -1){
            //如果失效时间不是永久，设置失效时间
            redisTemplate.expire(getRedisKey(),expire, TimeUnit.SECONDS);
        }
    }
    /**      * 删除
     *      * @param key 传入key的名称
     */
    public void remove(String key) {
        hashOperations.delete(getRedisKey(), key);
    }

    /**      * 查询
     *      * @param key 查询的key
     * @return
     */
    public T get(String key) {
        return hashOperations.get(getRedisKey(), key);
    }

    /**      * 获取当前redis库下所有对象
     *
     * @return
     */
    public List<T> getAll() {
        return hashOperations.values(getRedisKey());
    }

    /**      * 查询查询当前redis库下所有key
     实训邦 www.sxbang.net
     13 / 19

     *
     * @return
     */
    public Set<String> getKeys() {
        return hashOperations.keys(getRedisKey());
    }

    /**      * 判断key是否存在redis中
     *      * @param key 传入key的名称
     * @return
     */
    public boolean isKeyExists(String key) {
        return hashOperations.hasKey(getRedisKey(), key);
    }

    /**      * 查询当前key下缓存数量
     *
     * @return
     */
    public long count() {
        return hashOperations.size(getRedisKey());
    }

    /**      * 清空redis
     */
    public void empty() {
        Set<String> set = hashOperations.keys(getRedisKey());
        set.stream().forEach(key -> hashOperations.delete(getRedisKey(), key));
    }

}

package com.tcy365.cache.ehcache;

import java.util.List;



/**
 * 缓存接口
 *
 * @category 缓存接口
 * @version 1.0
 */
public interface Cache {

    public static final String CACHE_FLAG = "Cache";

    /**
     * 设置缓存
     *
     * @category 设置缓存
     * @param key
     * @param value
     * @param timeout
     *            ms
     */
    public <T> void set(String key, T value, long timeout);

    /**
     * 设置缓存
     *
     * @category 设置缓存
     * @param key
     * @param value
     * @param expireAt
     *            ms
     */
    public <T> void setExpireAt(String key, T value, long expireAt);

    /**
     * 获取缓存
     *
     * @category 获取缓存
     * @param key
     * @return Object 缓存对象
     */
    public <T> T get(String key);

    /**
     * 使某个缓存过期
     *
     * @category 使某个缓存过期
     * @param key
     * @param timeout
     * @return T 缓存对象
     */
    public boolean expire(String key, long timeout);

    /**
     * 使得某个缓存在某个时刻过期
     *
     * @category 使得某个缓存在某个时刻过期
     * @param key
     * @param expireAt
     */
    public boolean expireAt(String key, long expireAt);

    /**
     * 判断某个缓存是否存在
     *
     * @category 判断某个缓存是否存在
     * @return boolean
     */
    public boolean exist(String key);

    /**
     * 删除缓存
     *
     * @category 删除缓存
     * @return boolean
     */
    public boolean del(String key);

    /**
     * 添加key 的list数据缓存
     * @return: void
     * @throws
     */
    public <T> void ladd(String key, T value);


}
package com.tcy365.cache.ehcache;
import com.tcy365.common.utils.StringHelper;

public class CacheFactory {

    public static final String REDIS = "redis";
    public static final String EHCACHE_DEFAULT_CACHE = "ehcache_default_cache";

    public static Cache build(String key) {
        if (StringHelper.isNullOrEmpty(key)) {
            throw new RuntimeException("不存在的缓存工具");
        }
        if (key.equalsIgnoreCase(REDIS)) {
            throw new RuntimeException("未实现Redis缓存");
           // return new RedisCache();
        } else if(key.equalsIgnoreCase(EHCACHE_DEFAULT_CACHE)){
            return new EhcacheDefaultCache();
        }else{
            throw new RuntimeException("不存在的缓存工具");
        }
    }

}

package com.tcy365.cache.ehcache;

import org.junit.Test;

public class EhcacheKitTest {

    @Test
    public void TestCachePut() {
        Cache cache = CacheFactory.build(CacheFactory.EHCACHE_DEFAULT_CACHE);// 缓存对象
        cache.set("test", "asdfasd", 20000);
        Object result = cache.get("test");
        System.out.println(result);

    }
}
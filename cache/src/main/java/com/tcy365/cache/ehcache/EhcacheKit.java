package com.tcy365.cache.ehcache;

import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheException;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

/**
 * ehcache 工具类
 */
public class EhcacheKit {
    private static CacheManager manager = null;
    private static String configfile = "ehcache.xml";

    private static interface Helper {
        Map<String, EhcacheKit> INSTANCES = new HashMap<>();
    }

    private Cache cache;

    private Timer timer;

    //EHCache初始化
    private static void init() {
        try {
            if (manager == null) {
                ClassLoader clas = EhcacheKit.class.getClassLoader();
                manager = CacheManager.create(clas.getResourceAsStream(configfile));
            }
        } catch (CacheException e) {
            e.printStackTrace();
        }
    }

    /**
     * 将数据存入Cache
     *
     * @param seconds          缓存时间
     * @param key       类似redis的Key
     * @param value     类似redis的value，value可以是任何对象、数据类型，比如person,map,list等
     */
    public void put(String key, Object value, int seconds) {
        Element ele = new Element(key, value);
        if (seconds != 0) {//失效时的间隔时间 和最后一次操作时间间隔
            ele.setTimeToLive(seconds);
            ele.setTimeToIdle(seconds);
        }
        cache.put(ele);
    }

    /**
     * 获取缓存cachename中key对应的value
     *
     * @param key
     * @return
     */
    public Element get(String key) {
        try {
            Element e = cache.get(key);
            if (e == null) {
                return null;
            }
            return e;
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } catch (CacheException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 清除缓存名称为cachename的缓存
     *
     */
    public void clearCache() {
        try {
            cache.removeAll();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /**
     * 判断缓存是否存在
     *
     * @throws
     */
    public boolean exist(String key) {
        if (get(key) != null) {
            return true;
        }
        return false;
    }

    /**
     * 移除缓存cachename中key对应的value
     *
     * @param key
     * @return
     */
    public boolean remove(String key) {
        boolean flag = cache.remove(key);
        cache.flush();
        return flag;
    }

    /**
     * 使缓存在某个时间过期
     *
     * @throws
     */
    public boolean expire(String key, int timeout) {
        boolean boo = false;
        Element el = get(key);
        if (el != null) {
            Object value = el.getObjectValue();
            put(key, value, timeout);
            boo = true;
        }
        return boo;
    }

    /**
     * 使缓存在某个时间过期
     *
     * @throws
     */
    public boolean expireAt(String key, int timeout) {
        return expire(key, timeout);
    }

    public void evictExpiredElements() {
        cache.evictExpiredElements();
    }


    /**
     * 获取实例
     *
     * @return
     * @category 获取实例
     */
    public static EhcacheKit getInstance(String cachename) {
        init();
        EhcacheKit instance = Helper.INSTANCES.get(cachename);
        if (instance != null) {
            return instance;
        }
        instance = new EhcacheKit();
        instance.cache = manager.getCache(cachename);
        instance.timer = new Timer();
        EhcacheKit _instance = instance;
        //默认时不会自动触发监听过期失效  只有访问才能触发   ，这里是为了让程序1分钟监听一次过期失效
        instance.timer.schedule(new TimerTask() {//1分钟监听一次过期失效
            @Override
            public void run() {
                _instance.cache.evictExpiredElements();
            }
        }, 500, 1000);
        return instance;
    }


}
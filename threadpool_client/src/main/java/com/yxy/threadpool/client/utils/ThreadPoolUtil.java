package com.yxy.threadpool.client.utils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/**
 * ClassName ThreadPoolFactory Description Create by yxy Date 2021/4/28 14:58
 */
public class ThreadPoolUtil {

    public static ConcurrentHashMap<String, ExecutorService> threadPool = new ConcurrentHashMap<>();
}

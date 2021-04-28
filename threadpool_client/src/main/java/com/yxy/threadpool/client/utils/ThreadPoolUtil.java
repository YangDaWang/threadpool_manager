package com.yxy.threadpool.client.utils;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName ThreadPoolFactory Description Create by yxy Date 2021/4/28 14:58
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ThreadPoolUtil {
    public static ConcurrentHashMap<String, ExecutorService> threadPool = new ConcurrentHashMap<>();
}

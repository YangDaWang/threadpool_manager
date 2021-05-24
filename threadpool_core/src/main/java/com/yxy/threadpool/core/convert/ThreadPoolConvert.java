package com.yxy.threadpool.core.convert;

import com.yxy.threadpool.api.dto.resp.ThreadPoolResp;
import com.yxy.threadpool.core.entity.HhThreadPoolDO;

/**
 * ClassName ThreadPoolConvert Description Create by yxy Date 2021/5/24 20:45
 */
public class ThreadPoolConvert {

    public static ThreadPoolResp convertByDB(HhThreadPoolDO hhThreadPoolDO) {
        return ThreadPoolResp.builder().corePoolSize(hhThreadPoolDO.getCorePoolSize())
                .maximumPoolSize(hhThreadPoolDO.getMaximumPoolSize())
                .poolName(hhThreadPoolDO.getPoolName())
                .queueSize(hhThreadPoolDO.getQueueSize())
                .queueType(hhThreadPoolDO.getQueueType())
                .threadPrefix(hhThreadPoolDO.getThreadPrefix())
                .build();
    }

}

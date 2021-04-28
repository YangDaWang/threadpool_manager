package com.yxy.threadpool.api.dto.resp;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName ThreadPoolResp Description Create by yxy Date 2021/4/28 13:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ThreadPoolResp {
    /**
     * 线程池名称
     */
    private String poolName;

    /**
     * 核心线程数
     */
    private Integer corePoolSize;

    /**
     * 最大线程数
     */
    private Integer maximumPoolSize;

    private String threadPrefix;

    /**
     * 队列类型
     */
    private Integer queueType;

    /**
     * 队列数量
     */
    private Integer queueSize;

}

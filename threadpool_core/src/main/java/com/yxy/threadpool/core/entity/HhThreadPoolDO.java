package com.yxy.threadpool.core.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author yangxinyu
 * @since 2021-04-27
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("hh_thread_pool")
public class HhThreadPoolDO extends Model<HhThreadPoolDO> {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 业务id
     */
    private Long businessId;

    /**
     * 告警策略ID
     */
    private Long alarmId;

    /**
     * 线程池名称
     */
    private String poolName;

    /**
     * 线程前缀
     */
    private String threadPrefix;

    /**
     * 核心线程数
     */
    private Integer corePoolSize;

    /**
     * 最大线程数
     */
    private Integer maximumPoolSize;

    /**
     * 队列类型
     */
    private Integer queueType;

    /**
     * 队列数量
     */
    private Integer queueSize;

    /**
     * 更新时间
     */
    private LocalDateTime updatedAt;

    /**
     * 创建时间
     */
    private LocalDateTime createdAt;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

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
@TableName("hh_alarm")
public class HhAlarmDO extends Model<HhAlarmDO> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 告警名称
     */
    private String name;

    /**
     * 告警类型
     */
    private String type;

    /**
     * 阈值
     */
    private Integer threshold;

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

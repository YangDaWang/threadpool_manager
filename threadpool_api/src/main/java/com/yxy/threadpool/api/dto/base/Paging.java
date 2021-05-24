package com.yxy.threadpool.api.dto.base;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Paging {
    /**
     * 总数
     */
    private long total = 0;

    /**
     * 每页显示条数，默认 10
     */
    private long limit = 10;

    /**
     * 标记位
     */
    private long offset = 0;

    /**
     * 游标,请求时带上
     */
    private String cursor;
}
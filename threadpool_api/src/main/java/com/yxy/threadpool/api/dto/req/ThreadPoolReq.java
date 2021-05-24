package com.yxy.threadpool.api.dto.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ClassName ThreadPoolReq Description Create by yxy Date 2021/4/28 13:25
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ThreadPoolReq {

    private String businessCode;

}

package com.yxy.threadpool_admin.controller;

import com.yxy.threadpool.api.dto.base.YxyBaseResponse;
import com.yxy.threadpool.api.dto.req.ThreadPoolReq;
import com.yxy.threadpool.api.dto.resp.ThreadPoolResp;
import com.yxy.threadpool.core.service.ThreadPoolService;
import com.yxy.threadpool.core.utils.JsonUtils;
import java.util.List;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName ThreadPoolController Description Create by yxy Date 2021/5/24 16:48
 */
@RestController
@RequestMapping("/threadpool")
@Slf4j
public class ThreadPoolController {

    @Resource
    ThreadPoolService threadPoolService;

    public YxyBaseResponse<List<ThreadPoolResp>> getThreadPoolConfig(
            @RequestBody ThreadPoolReq threadPoolReq) {
        log.info("获取线程池配置参数, 请求参数:{}", JsonUtils.obj2String(threadPoolReq));
        List<ThreadPoolResp> poolByBusinessCode = threadPoolService
                .getPoolByBusinessCode(threadPoolReq.getBusinessCode());
        log.info("获取线程池配置参数, 响应参数:{}", JsonUtils.obj2String(poolByBusinessCode));
        return YxyBaseResponse.<List<ThreadPoolResp>>builder().data(poolByBusinessCode).build();
    }

}

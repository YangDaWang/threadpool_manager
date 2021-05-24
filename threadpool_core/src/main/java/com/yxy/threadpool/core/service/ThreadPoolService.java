package com.yxy.threadpool.core.service;

import com.yxy.threadpool.api.dto.resp.ThreadPoolResp;
import java.util.List;

/**
 * ClassName ThreadPoolService Description Create by yxy Date 2021/5/24 20:22
 */
public interface ThreadPoolService {

    List<ThreadPoolResp> getPoolByBusinessCode(String businessCode);

}

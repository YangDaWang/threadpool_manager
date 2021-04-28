package com.yxy.threadpool.client.service;

import com.yxy.threadpool.api.dto.resp.ThreadPoolResp;
import java.util.List;

/**
 * ClassName ThreadPoolService Description Create by yxy Date 2021/4/28 15:02
 */
public interface ThreadPoolService {

    List<ThreadPoolResp> findByBusinessId(Long businessId);

}

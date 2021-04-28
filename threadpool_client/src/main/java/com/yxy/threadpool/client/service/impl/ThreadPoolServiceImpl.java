package com.yxy.threadpool.client.service.impl;

import com.yxy.threadpool.api.dto.resp.ThreadPoolResp;
import com.yxy.threadpool.client.service.ThreadPoolService;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * ClassName ThreadPoolServiceImpl Description Create by yxy Date 2021/4/28 15:02
 */
@Service
public class ThreadPoolServiceImpl implements ThreadPoolService {

    @Override
    public List<ThreadPoolResp> findByBusinessId(Long businessId) {
        return null;
    }
}

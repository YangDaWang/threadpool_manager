package com.yxy.threadpool.core.service.impl;

import com.yxy.threadpool.api.dto.resp.ThreadPoolResp;
import com.yxy.threadpool.core.convert.ThreadPoolConvert;
import com.yxy.threadpool.core.dao.ThreadPoolDao;
import com.yxy.threadpool.core.entity.HhThreadPoolDO;
import com.yxy.threadpool.core.service.ThreadPoolService;
import java.util.List;
import java.util.stream.Collectors;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * ClassName ThreadPoolServiceImpl Description Create by yxy Date 2021/5/24 20:22
 */
@Service
public class ThreadPoolServiceImpl implements ThreadPoolService {

    @Resource
    ThreadPoolDao threadPoolDao;

    @Override
    public List<ThreadPoolResp> getPoolByBusinessCode(String businessCode) {

        List<HhThreadPoolDO> threadPoolByBusinessCode = threadPoolDao
                .getThreadPoolByBusinessCode(businessCode);

        return threadPoolByBusinessCode.stream()
                .map(ThreadPoolConvert::convertByDB).collect(Collectors.toList());
    }
}

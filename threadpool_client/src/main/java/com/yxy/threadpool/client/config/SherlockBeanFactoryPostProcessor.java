package com.yxy.threadpool.client.config;

import com.yxy.threadpool.api.dto.resp.ThreadPoolResp;
import com.yxy.threadpool.client.service.ThreadPoolService;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Resource;
import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.stereotype.Component;

/**
 * spring容器初始化后执行，并且只执行一次。
 */
@Component
@ConditionalOnClass(value = {ThreadPoolService.class})
public class SherlockBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Resource
    ThreadPoolService poolService;

    @Value("${yxy.businessId}")
    Long businessId;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        poolService.findByBusinessId(businessId).forEach(i -> {
            //注册bean定义
            beanFactory.registerSingleton(i.getPoolName(), new ThreadPoolExecutor(
                    i.getCorePoolSize(),
                    i.getMaximumPoolSize(),
                    30,
                    TimeUnit.SECONDS,
                    getQueueByType(i.getQueueType(), i.getQueueSize()),
                    new BasicThreadFactory.Builder().namingPattern(i.getThreadPrefix() + "-%d").daemon(true)
                            .build(),
                    new ThreadPoolExecutor.DiscardPolicy()
            ));
        });
    }

    private BlockingQueue getQueueByType(Integer queueType, Integer queueSize) {
        //todo 根据参数去配置相应的任务队列
        return new LinkedBlockingDeque<>(queueSize);
    }
}
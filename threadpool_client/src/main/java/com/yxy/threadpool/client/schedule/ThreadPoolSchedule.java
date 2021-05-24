package com.yxy.threadpool.client.schedule;

import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ThreadPoolSchedule {

    /**
     * 每1分钟拿取一次配置信息
     */
    @Scheduled(fixedDelay = 1000 * 60 * 5)
    public void setCheckPoint() {



    }

}
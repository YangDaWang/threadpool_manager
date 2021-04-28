package com.yxy.threadpool_server.controller;

import com.yxy.threadpool.api.dto.req.ThreadPoolReq;
import com.yxy.threadpool.api.dto.resp.ThreadPoolResp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName ThreadPoolController Description Create by yxy Date 2021/4/28 13:28
 */
@RestController
@RequestMapping("/threadpool")
public class ThreadPoolController {

    @PostMapping("/getPoolParam")
    public ThreadPoolResp getParam(@RequestBody ThreadPoolReq req) {
        return null;
    }

}

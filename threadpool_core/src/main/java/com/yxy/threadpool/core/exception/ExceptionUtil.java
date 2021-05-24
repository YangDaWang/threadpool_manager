package com.yxy.threadpool.core.exception;


import com.yxy.threadpool.core.enums.ErrorCodeEnum;

public class ExceptionUtil {

    public static ErrorInfo errorInfo(ErrorCodeEnum errorCodeEnum) {

        return ErrorInfo.builder().code(errorCodeEnum.getCode())
                .message(errorCodeEnum.getZhMessage()).build();

    }

}

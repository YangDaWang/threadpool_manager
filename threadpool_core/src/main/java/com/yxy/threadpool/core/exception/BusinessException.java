package com.yxy.threadpool.core.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

public class BusinessException extends CustomRuntimeException {
    private static final HttpStatus DEFAULT_HTTP_STATUS = HttpStatus.UNPROCESSABLE_ENTITY;

    @Getter
    private HttpStatus httpStatus = DEFAULT_HTTP_STATUS;

    public BusinessException(ErrorInfo errorInfo) {
        this(errorInfo, null);
    }

    public BusinessException(ErrorInfo errorInfo, HttpStatus httpStatus) {
        super(errorInfo);
        if (httpStatus != null) {
            this.httpStatus = httpStatus;
        }
    }
}
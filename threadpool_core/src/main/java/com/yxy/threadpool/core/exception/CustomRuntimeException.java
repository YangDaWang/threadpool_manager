package com.yxy.threadpool.core.exception;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Builder
@Data
public class CustomRuntimeException extends RuntimeException{

    protected ErrorInfo errorInfo;

    public CustomRuntimeException(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }
}

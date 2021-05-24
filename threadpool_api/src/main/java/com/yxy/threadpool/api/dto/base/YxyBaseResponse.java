package com.yxy.threadpool.api.dto.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Collections;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class YxyBaseResponse<T> {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected Integer code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected Paging paging;
    protected T data;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected Object extraParam;

    public static <T> YxyBaseResponse<T> withCodeMsg(Integer code, String message) {
        return YxyBaseResponse.<T>builder().code(code).message(message).build();
    }

    public static YxyBaseResponse<Object> success() {
        return builder().data(Collections.singletonMap("success", true)).build();
    }

    public static YxyBaseResponse<Object> failed() {
        return builder().data(Collections.singletonMap("success", false)).build();
    }
}
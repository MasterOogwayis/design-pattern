package com.zsw.commons;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Shaowei Zhang on 2019/3/17 18:28
 **/
@Data
@Builder
public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = -8243508847581606389L;

    private int code;

    private String message;

    private T data;

    public <R> ApiResult<R> success(R data) {
        return ApiResult.<R>builder().code(0).message("success").data(data).build();
    }

    public ApiResult<?> faild(String message) {
        return builder().code(-1).message(message).build();
    }


}

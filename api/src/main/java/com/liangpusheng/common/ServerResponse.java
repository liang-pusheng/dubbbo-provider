package com.liangpusheng.common;

import lombok.Data;

@Data
public class ServerResponse<T> {

    private Integer code;

    private String msg;

    private T data;

    private ServerResponse(Integer code, T data) {
        this.code = code;
        this.data = data;
    }

    public static <T> ServerResponse<T> createBySuccess(Integer code, T data) {
        return new ServerResponse<>(code, data);
    }
}

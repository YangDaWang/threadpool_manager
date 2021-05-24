package com.yxy.threadpool.core.enums;

public enum ErrorCodeEnum {

    /**
     * 返回调用方的错误码
     */
    USER_NOT_EXIST(500000, "", "", "");


    int code;
    String zhMessage;
    String enMessage;
    String ruMessage;

    ErrorCodeEnum(int code, String zhMessage, String enMessage, String ruMessage) {
        this.code = code;
        this.zhMessage = zhMessage;
        this.enMessage = enMessage;
        this.ruMessage = ruMessage;
    }

    public int getCode() {
        return code;
    }

    public String getZhMessage() {
        return zhMessage;
    }

    public String getEnMessage() {
        return enMessage;
    }

    public String getRuMessage() {
        return ruMessage;
    }

    public String getMessage(String lang) {
        if ("en_us".equalsIgnoreCase(lang)) {
            return getEnMessage();
        } else if ("ru_ru".equalsIgnoreCase(lang)) {
            return getRuMessage();
        } else {
            return zhMessage;
        }
    }

    public static ErrorCodeEnum get(int code) {
        for (ErrorCodeEnum errorCodeEnum : ErrorCodeEnum
                .values()) {
            if (errorCodeEnum.getCode() == code) {
                return errorCodeEnum;
            }
        }
        return null;
    }
}

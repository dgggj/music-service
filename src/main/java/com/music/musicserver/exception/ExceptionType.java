package com.music.musicserver.exception;

public enum ExceptionType {
    INNER_ERROR(500, "系统内部错误"),
    USER_NAME_DUPLICATE(40001001, "用户名重复"),
    UNAUTHORIZED(401, "未登录"),
    BAD_REQUEST(400, "请求错误"),
    FORBIDDEN(403, "无权操作"),
    NOT_FOUND(404, "未找到"),
    USER_NOT_FOUND(40401001, "用户不存在"),
    USER_PASSWORD_NOT_MATCH(40001003, "用户名或密码错误"),
    USER_NOT_ENABLED(50001001, "用户未启用"),
    USER_LOCKED(50001002, "用户目前被锁定"),
    MUSIC_NOT_FOUND(40402001, "歌曲不存在"),
    FILE_NOT_FOUND(40403001, "文件不存在"),
    FILE_NOT_PERMISSION(40303001, "没有此权限修改"),
    PLAYLIST_NOT_FOUND(40404001, "歌单不存在");
    private final Integer code;
    private final String message;


    ExceptionType(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }


}
package com.amor.market.amormarketcore.bean;

/**
 * rest返回对象
 */
public class ResHelper<T> {
    /**
     * 服务器响应数据
     */
    private T payload;

    /**
     * 请求是否成功
     */
    private boolean success;

    /**
     * 错误信息
     */
    private String msg;

    /**
     * 状态码
     */
    private int code = -1;

    /**
     * 服务器响应时间
     */
    private long timestamp;

    public ResHelper() {
        this.timestamp = System.currentTimeMillis() / 1000;
    }

    public ResHelper(boolean success) {
        this.timestamp = System.currentTimeMillis() / 1000;
        this.success = success;
    }

    public ResHelper(boolean success, T payload) {
        this.timestamp = System.currentTimeMillis() / 1000;
        this.success = success;
        this.payload = payload;
    }

    public ResHelper(boolean success, T payload, int code) {
        this.timestamp = System.currentTimeMillis() / 1000;
        this.success = success;
        this.payload = payload;
        this.code = code;
    }

    public ResHelper(boolean success, String msg) {
        this.timestamp = System.currentTimeMillis() / 1000;
        this.success = success;
        this.msg = msg;
    }

    public ResHelper(boolean success, String msg, int code) {
        this.timestamp = System.currentTimeMillis() / 1000;
        this.success = success;
        this.msg = msg;
        this.code = code;
    }

    public T getPayload() {
        return payload;
    }

    public void setPayload(T payload) {
        this.payload = payload;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public static ResHelper ok() {
        return new ResHelper(true);
    }

    public static <T> ResHelper ok(T payload) {
        return new ResHelper(true, payload);
    }

    public static <T> ResHelper ok(int code) {
        return new ResHelper(true, null, code);
    }

    public static <T> ResHelper ok(T payload, int code) {
        return new ResHelper(true, payload, code);
    }

    public static ResHelper fail() {
        return new ResHelper(false);
    }

    public static ResHelper fail(String msg) {
        return new ResHelper(false, msg);
    }

    public static ResHelper fail(int code) {
        return new ResHelper(false, null, code);
    }

    public static ResHelper fail(int code, String msg) {
        return new ResHelper(false, msg, code);
    }

}
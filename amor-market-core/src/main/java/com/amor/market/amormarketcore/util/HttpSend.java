package com.amor.market.amormarketcore.util;


/**
 * http请求方法
 * @author dxt
 * @date 2019年11月5日13:29:44
 * */
public class HttpSend {



    /**
     * 发送 GET 请求（HTTP），不带输入数据
     *
     * @param url 地址
     * @return json字符串
     */
    public static String doGetStr(String url) {
        return HttpTool.nGet(url, null);
    }

    public static String doGetStr(String url, Object param) {
        return HttpTool.nGet(url, param);
    }

    /**
     * 发送 GET 请求（HTTP），不带输入数据
     *
     * @param url 地址
     * @return json字符串
     */
    public static Object doGetObj(String url, Object resultEntity) {
        String str = HttpTool.nGet(url, null);
        return ObjJsonUtil.jsonToObj(str, resultEntity.getClass());
    }

    /**
     * 发送 GET 请求（HTTP）
     *
     * @param url 地址
     * @return 实体
     */
    public static Object doGetObj(String url, Object param, Object resultEntity) {
        String str = HttpTool.nGet(url, param);
        return ObjJsonUtil.jsonToObj(str, resultEntity.getClass());
    }

    /**
     * 发送 POST请求（HTTP），不带输入数据
     *
     * @param url 地址
     * @return json字符串
     */
    public static String doPostStr(String url) {
        return HttpTool.nPost(url, null);
    }

    public static String doPostStr(String url, Object param) {
        return HttpTool.nPost(url, param);
    }

    /**
     * 发送 POST请求（HTTP），不带输入数据
     *
     * @param url 地址
     * @return 实体
     */
    public static Object doPostObj(String url, Object resultEntity) {
        String str = HttpTool.nPost(url, null);
        return ObjJsonUtil.jsonToObj(str, resultEntity.getClass());
    }

    /**
     * 发送 POST 请求（HTTP）
     *
     * @param url 地址
     * @return 实体
     */
    public static Object doPostObj(String url, Object param, Object resultEntity) {
        String str = HttpTool.nPost(url, param);
        return ObjJsonUtil.jsonToObj(str, resultEntity.getClass());
    }

}

package com.amor.market.amormarketcore.constant;

import lombok.Data;

/**
 * 微信api
 *
 */

public enum WxApi {

    Jscode2session("/sns/jscode2session","code2Session换取微信openId");

    private String url;

    private String urlDesc;


    public  static String getUrl(WxApi wxApi){
        return  Wx.WxHost+wxApi.getUrl();
    }

    WxApi(String url, String urlDesc) {
        this.url = url;
        this.urlDesc = urlDesc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlDesc() {
        return urlDesc;
    }

    public void setUrlDesc(String urlDesc) {
        this.urlDesc = urlDesc;
    }
}

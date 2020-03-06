package com.amor.market.amormarketcore.service.imp;


import com.amor.market.amormarketcore.bean.ResHelper;
import com.amor.market.amormarketcore.constant.Wx;
import com.amor.market.amormarketcore.constant.WxApi;
import com.amor.market.amormarketcore.service.WxUserService;
import com.amor.market.amormarketcore.util.HttpTool;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@Slf4j
public class WxUserServiceImp implements WxUserService {


    @Override
    public ResHelper getWxOpenId(String wxCode) {
        HashMap map = new HashMap();
        map.put("appid", Wx.AppID);
        map.put("secret", Wx.AppSecret);
        map.put("js_code", wxCode);
        map.put("grant_type", "authorization_code");
        String Jscode2session = HttpTool.nGet(WxApi.getUrl(WxApi.Jscode2session), map);
        log.info("获取用户openId响应：{}", Jscode2session);

        return ResHelper.ok(Jscode2session);
    }
}

package com.amor.market.amormarketcore.service.imp;


import com.alibaba.fastjson.JSONObject;
import com.amor.market.amormarketcore.bean.ResHelper;
import com.amor.market.amormarketcore.bean.dto.UserRegister;
import com.amor.market.amormarketcore.bean.entity.WxUserBaseInfoEntity;
import com.amor.market.amormarketcore.constant.Wx;
import com.amor.market.amormarketcore.constant.WxApi;
import com.amor.market.amormarketcore.mapper.WxUserBaseInfoMapper;
import com.amor.market.amormarketcore.service.WxUserService;
import com.amor.market.amormarketcore.util.HttpTool;
import com.amor.market.amormarketcore.util.ModelHelper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@Slf4j
public class WxUserServiceImp  implements WxUserService {

    @Autowired
    WxUserBaseInfoMapper wxUserBaseInfoMapper;

    @Override
    public ResHelper getWxOpenId(String wxCode) {
        HashMap map = new HashMap();
        map.put("appid", Wx.AppID);
        map.put("secret", Wx.AppSecret);
        map.put("js_code", wxCode);
        map.put("grant_type", "authorization_code");
        String Jscode2session = HttpTool.nGet(WxApi.getUrl(WxApi.Jscode2session), map);
        log.info("获取用户openId响应：{}", Jscode2session);

        return ResHelper.success(Jscode2session);
    }

    @Override
    public ResHelper userRegister(UserRegister userRegister) {
        QueryWrapper<WxUserBaseInfoEntity> ew = new QueryWrapper<>();
        ew.eq("open_id",userRegister.getOpenId());
        ew.eq("state","1");
        WxUserBaseInfoEntity entity =  wxUserBaseInfoMapper.selectOne(ew);
        if(entity==null){
            BeanUtils.copyProperties(userRegister, entity);
            ModelHelper.initModel(entity);
            log.info("" + entity);
            wxUserBaseInfoMapper.insert(entity);
            String  userId = entity.getUserId();
            log.info("用户id" + userId);
            return ResHelper.success(userId);
        }

        return ResHelper.success(entity.getUserId());
    }
}

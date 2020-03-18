package com.amor.market.amormarketcore.controller;

import com.amor.market.amormarketcore.bean.ResHelper;
import com.amor.market.amormarketcore.bean.dto.UserRegister;
import com.amor.market.amormarketcore.service.WxUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(description = "wx用户注册")
@RequestMapping("/wx")
@Slf4j
public class WxUserBasicController {
    @Autowired
    WxUserService wxUserService;


    @ApiOperation(value = "获取微信用户openId")
    @PostMapping("/user/get/open/id")
    public ResHelper getUserOpenId(@RequestParam("wxCode") @ApiParam("微信登录凭证") String wxCode) {
        return  wxUserService.getWxOpenId(wxCode);
    }

    @ApiOperation(value = "注册刷新微信用户信息")
    @PostMapping("/user/register")
    public ResHelper getUserRegister(@RequestBody UserRegister userRegister) {
        log.info("注册刷新微信用户信息入参：{}",userRegister);
        return  wxUserService.userRegister (userRegister);
    }
}

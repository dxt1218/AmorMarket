package com.amor.market.amormarketcore.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(description = "wx用户注册")
@RequestMapping("/wx")
@Slf4j
public class WxUserBasicController {



    @ApiOperation(value = "获取微信用户openId")
    @PostMapping("/user/get/open/id")
    public void getUserOpenId(@RequestParam("wxCode") @ApiParam("微信登录凭证") String wxCode) {

    }

}

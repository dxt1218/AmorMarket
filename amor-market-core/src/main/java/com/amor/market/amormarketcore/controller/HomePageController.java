package com.amor.market.amormarketcore.controller;

import com.amor.market.amormarketcore.bean.ResHelper;
import com.amor.market.amormarketcore.bean.dto.HomePageDTO;
import com.amor.market.amormarketcore.bean.dto.UserRegister;
import com.amor.market.amormarketcore.service.HomePageService;
import com.amor.market.amormarketcore.service.WxUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@Api(description = "Market首页")
@RequestMapping("/home")
@Slf4j
public class HomePageController {

    @Autowired
    HomePageService homePageService;

    @ApiOperation(value = "首页")
    @GetMapping("/page/info")
    public ResHelper<HomePageDTO> homePage() {

        //log.info("用户编号 ：{}",userId);
        return  homePageService.HomePage();
    }

}

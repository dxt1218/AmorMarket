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
@Api(description = "Market首页")
@RequestMapping("/home")
@Slf4j
public class HomePageController {


    @ApiOperation(value = "首页")
    @PostMapping("/page/info")
    public ResHelper homePage(@RequestHeader("userId") String userId) {
        return  null;
    }

}

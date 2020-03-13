package com.amor.market.amormarketcore.service;

import com.amor.market.amormarketcore.bean.ResHelper;
import com.amor.market.amormarketcore.bean.dto.UserRegister;

public interface WxUserService {
    ResHelper getWxOpenId(String wxCode);

    ResHelper userRegister(UserRegister userRegister);
}

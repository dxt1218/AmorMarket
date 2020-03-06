package com.amor.market.amormarketcore.service;

import com.amor.market.amormarketcore.bean.ResHelper;

public interface WxUserService {
    ResHelper getWxOpenId(String wxCode);
}

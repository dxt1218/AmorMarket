package com.amor.market.amormarketcore.service.imp;


import com.amor.market.amormarketcore.bean.ResHelper;
import com.amor.market.amormarketcore.bean.dto.HomePageDTO;
import com.amor.market.amormarketcore.bean.dto.UserRegister;
import com.amor.market.amormarketcore.bean.entity.MarketTicketBaseEntity;
import com.amor.market.amormarketcore.bean.entity.WxUserBaseInfoEntity;
import com.amor.market.amormarketcore.constant.Wx;
import com.amor.market.amormarketcore.constant.WxApi;
import com.amor.market.amormarketcore.mapper.MarketTicketBaseMapper;
import com.amor.market.amormarketcore.mapper.WxUserBaseInfoMapper;
import com.amor.market.amormarketcore.service.HomePageService;
import com.amor.market.amormarketcore.service.WxUserService;
import com.amor.market.amormarketcore.util.HttpTool;
import com.amor.market.amormarketcore.util.ModelHelper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@Slf4j
public class HomePageServiceImp implements HomePageService {

    @Autowired
    MarketTicketBaseMapper marketTicketBaseMapper;

    @Override
    public ResHelper HomePage() {
        HomePageDTO resultDTO = new HomePageDTO();

        QueryWrapper<MarketTicketBaseEntity> qw = new QueryWrapper<>();
        qw.orderBy(true, false, "order_num");
        qw.eq("flag", "1");
        qw.eq("priv_flag", "0");
        List<MarketTicketBaseEntity> tikList = marketTicketBaseMapper.selectList(qw);//共有卷

        resultDTO.setTikList(tikList);
        return ResHelper.success(resultDTO);
    }
}

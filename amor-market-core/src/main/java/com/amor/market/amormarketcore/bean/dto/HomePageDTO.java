package com.amor.market.amormarketcore.bean.dto;

import com.amor.market.amormarketcore.bean.entity.MarketTicketBaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

@Data
@ApiModel("首页模板实体")
public class HomePageDTO {

    @ApiModelProperty("通用卷列表")
    private  List<MarketTicketBaseEntity> tikList;
}

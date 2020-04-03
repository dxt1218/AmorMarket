package com.amor.market.amormarketcore.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 表:  market_ticket_base
 *
 * @author dxt
 * @date 2020-03-25 09:04:41
 */
@Data
@ApiModel("market_ticket_base实体")
@TableName("market_ticket_base")
public class MarketTicketBaseEntity extends Model<MarketTicketBaseEntity> {


    @TableId(value = "ticket_id", type = IdType.AUTO)
    @ApiModelProperty("")
    private Integer ticketId;//

    @TableField("ticket_name")
    @ApiModelProperty("票名")
    private String ticketName;//票名

    @TableField("user_id")
    @ApiModelProperty("")
    private String userId;//

    @TableField("tic_type")
    @ApiModelProperty("票据类型")
    private String ticType;//票据类型

    @TableField("remainder_num")
    @ApiModelProperty("剩余数量")
    private String remainderNum;//剩余数量

    @TableField("flag")
    @ApiModelProperty("'有效  0 无效 1 有效")
    private String flag;//'有效  0 无效 1 有效

    @TableField("create_time")
    @ApiModelProperty("")
    private LocalDateTime createTime;//

    @TableField("order_num")
    @ApiModelProperty("排序字段")
    private String orderNum;//

    @TableField("tic_pic")
    @ApiModelProperty("图片")
    private String ticPic;//


    @TableField("priv_flag")
    @ApiModelProperty("私有标识 0共有 1私有")
    private String privFlag;

    @Override
    protected Serializable pkVal() {
        return this.createTime;
    }
}


package com.amor.market.amormarketcore.bean.entity;



import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * 会员信息表
 * */
@Data
@TableName("wx_user_base_info")
public class WxUserBaseInfoEntity extends Model<WxUserBaseInfoEntity> {

    @TableId(value = "user_id",type = IdType.AUTO )
    private String userId;

    @TableField("open_id")
    private String openId;

    @TableField("nick_name")
    private String nickName;

    @TableField("gender")
    private String gender;

    @TableField("avatar_url")
    private String avatarUrl;

    @TableField("state")
    private String state;

    @TableField("create_time")
    private LocalDateTime create_time;

    @TableField("update_time")
    private LocalDateTime updateTime;




    @Override
    protected Serializable pkVal() {
        return this.userId;
    }
}

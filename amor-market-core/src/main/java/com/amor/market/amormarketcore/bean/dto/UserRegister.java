package com.amor.market.amormarketcore.bean.dto;

import lombok.Data;

@Data
public class UserRegister {


    private String nickName;//微信昵称

    private String gender; //性别 0男 1女

    private String avatarUrl; //头像地址

    private String openId; //wxID
}
package com.amor.market.amormarketcore.bean.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Test2 {

    private String name;

    private String say;

    public Test2(String name, String say) {
        System.out.println("Test2创建对象成功");
        this.name = name;
        this.say = say;
        System.out.println("当前属性name="+name+"，say="+say);
    }
}

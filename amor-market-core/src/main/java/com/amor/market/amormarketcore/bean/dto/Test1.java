package com.amor.market.amormarketcore.bean.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Test1 {

    private String name;

    private String say;

    public Test1(String name, String say) {
        System.out.println("Test1创建对象成功");
        this.name = name;
        this.say = say;
        System.out.println("当前属性name="+name+"，say="+say);
    }
}

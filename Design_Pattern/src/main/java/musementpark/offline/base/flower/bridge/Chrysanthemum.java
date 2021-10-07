package musementpark.offline.base.flower.bridge;
/*
author: FanqingM
description: 栽种不同颜色的菊花
 */
public class Chrysanthemum implements IMake{
    private IColor color;

    //此函数用于测试中，进行不同颜色测试，本质上也是一种封装
    void setColor(IColor color) {
        this.color = color;
    }

    @Override
    public void plant() {
        System.out.println("栽种" + color.getColor() + "菊花");
    }
}

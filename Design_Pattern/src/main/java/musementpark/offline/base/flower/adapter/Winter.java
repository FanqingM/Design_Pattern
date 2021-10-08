package musementpark.offline.base.flower.adapter;
/*
author: FanqingM
description: 冬季栽种花朵
 */
public class Winter {
    void charge(int a[]) {
        if(!(a[0] == 1 && a[1] == 0))
        {
            System.out.println("冬季只能种梅花");
        }
        else
        {
            System.out.println("冬季栽种梅花");
        }
    }
}

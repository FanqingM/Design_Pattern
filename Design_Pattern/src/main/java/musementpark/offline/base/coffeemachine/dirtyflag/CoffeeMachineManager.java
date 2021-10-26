package musementpark.offline.base.maps.dirtyflag;


/*
author: hzs
description: 咖啡机管理员类
 */
public class CoffeeMachineManager {
    private CoffeeMachine coffeeMachine;

    /*
     * CoffeeMachineManager构造器
     */
    public CoffeeMachineManager(CoffeeMachine coffeeMachine){
        this.coffeeMachine=coffeeMachine;
    }



    /*
     * 管理员维护并上报维护费用
     */
    public void reportFee(){
        System.out.println("管理员上报了" + coffeeMachine.getFee() + "的维护费用");
    }
}

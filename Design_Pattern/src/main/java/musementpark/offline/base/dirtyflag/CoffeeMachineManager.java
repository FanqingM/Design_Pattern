package musementpark.offline.base.dirtyflag;


import musementpark.util.Print;
import musementpark.util.PrintInfo;

/**
author: hzs
description:咖啡机管理员类
 */
public class CoffeeMachineManager {
    private CoffeeMachine coffeeMachine;

    /**
     * 咖啡机管理员构造器
     * @param coffeeMachine
     */
    public CoffeeMachineManager(CoffeeMachine coffeeMachine){
        this.coffeeMachine=coffeeMachine;
    }



    /**
     *管理员上报咖啡机的维护费用
     */
    public void reportFee(){
        Print.print(
                new PrintInfo(
                        "CoffeeMachineManager",
                        String.valueOf(System.identityHashCode(this)),
                        "reportFee",
                        "管理员维护咖啡机并上报维护费用"
                )
        );
        System.out.println("管理员维护完成并上报"+coffeeMachine.getFee()+"元的维护费用");
    }
}

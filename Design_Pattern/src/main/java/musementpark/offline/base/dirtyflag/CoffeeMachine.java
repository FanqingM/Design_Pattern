package musementpark.offline.base.dirtyflag;

import musementpark.util.Print;
import musementpark.util.PrintInfo;
/**
author: hzs
description:咖啡机类
 */
public class CoffeeMachine{
    private boolean empty;
    private int coffeeBean;
    private final int baseFee;
    private final int coffeeBeanFee;

    /**
     *咖啡机的构造器
     */
    public CoffeeMachine(){
        empty=false;
        coffeeBean=100;
        baseFee=20;
        coffeeBeanFee=100;
    }

    /**
     *获取咖啡机中咖啡豆是否用完
     * @return boolean
     */
    public boolean getEmpty(){
        return empty;
    }

    /**
     *制作咖啡
     */
    public void makeCoffee(){
        if(!getEmpty()){
            coffeeBean=coffeeBean-10;
            Print.print(
                    new PrintInfo(
                            "CoffeeMachine",
                            String.valueOf(System.identityHashCode(this)),
                            "makeCoffee",
                            "成功制作了咖啡"
                    )
            );
            if(coffeeBean==0){
                empty=true;
                Print.print(
                        new PrintInfo(
                                "CoffeeMachine",
                                String.valueOf(System.identityHashCode(this)),
                                "makeCoffee",
                                "咖啡豆需要添加"
                        )
                );
            }
        }
        else{
            Print.print(
                    new PrintInfo(
                            "CoffeeMachine",
                            String.valueOf(System.identityHashCode(this)),
                            "makeCoffee",
                            "咖啡豆不足，制作咖啡失败"
                    )
            );
        }
    }

    /**
     *添加咖啡豆
     */
    public void addCoffeeBean(){
        coffeeBean=100;
        empty=false;
        Print.print(
                new PrintInfo(
                        "CoffeeMachine",
                        String.valueOf(System.identityHashCode(this)),
                        "addCoffeeBean",
                        "添加了咖啡豆"
                )
        );
    }


    /**
     * 进行维护并获取维护费用
     * @return int
     */
    public int getFee(){
        System.out.println("正在获取维护费用...");
        if(getEmpty()){
            Print.print(
                    new PrintInfo(
                            "CoffeeMachine",
                            String.valueOf(System.identityHashCode(this)),
                            "getFee",
                            "咖啡豆用完了，维护时还需要添加咖啡豆"
                    )
            );
            addCoffeeBean();
            return baseFee+coffeeBeanFee;
        }
        else {
            Print.print(
                    new PrintInfo(
                            "CoffeeMachine",
                            String.valueOf(System.identityHashCode(this)),
                            "getFee",
                            "咖啡豆充足，只需要进行基本维护"
                    )
            );
            return baseFee;
        }
    }
}

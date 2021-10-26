package musementpark.offline.base.maps.dirtyflag;


/*
author: hzs
description: 咖啡机类
 */
public class CoffeeMachine{
    private boolean empty;
    private int coffeeBean;
    private int baseFee;
    private int coffeeBeanFee;

    /*
     * 咖啡机的构造器
     */
    public CoffeeMachine(){
        empty=false;
        coffeeBean=100;
        baseFee=20;
        coffeeBeanFee=100;
    }

    /*
     * 获取剩余咖啡豆
     */
    public boolean getEmpty(){
        return empty;
    }

    /*
     * 制作咖啡，消耗咖啡豆
     */
    public void makeCoffee(){
        if(getEmpty()==false){
            coffeeBean=coffeeBean-10;
            System.out.println("咖啡制作成功");
            if(coffeeBean==0){
                empty=true;
                System.out.println("咖啡豆用完了，脏标记置为真");
            }
        }
        else{
            System.out.println("机器中咖啡豆不足，咖啡制作失败");
        }
    }

    /*
     * 往机器中加满咖啡豆
     */
    public void addCoffeeBean(){
        coffeeBean=100;
        empty=false;
        System.out.println("咖啡豆已加满");
    }


    /*
     * 维护咖啡机并计算费用
     */
    public int getFee(){
        System.out.println("对咖啡机进行维护");
        if(getEmpty()){
            System.out.println("咖啡机中的咖啡豆不足，需要添加");
            addCoffeeBean();
            return baseFee+coffeeBeanFee;
        }
        else {
            System.out.println("咖啡机的咖啡豆不需要添加");
            return baseFee;
        }
    }
}

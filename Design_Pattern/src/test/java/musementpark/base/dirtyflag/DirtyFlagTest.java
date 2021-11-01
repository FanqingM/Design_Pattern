package musementpark.base.dirtyflag;

import musementpark.offline.base.dirtyflag.CoffeeMachine;
import musementpark.offline.base.dirtyflag.CoffeeMachineManager;
import org.junit.jupiter.api.Test;

/**
 author: hzs
 description:脏标记模式测试类
 */
class DirtyFlagTest {
    /**
      脏标记模式测试
     */
    @Test
   public void DirtyFlagTest(){
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        CoffeeMachineManager coffeeMachineManager = new CoffeeMachineManager(coffeeMachine);
        for(int i = 0;i < 5; i++) {
            coffeeMachine.makeCoffee();
        }
        coffeeMachineManager.reportFee();
        for(int i = 0;i < 6; i++) {
            coffeeMachine.makeCoffee();
        }
        coffeeMachineManager.reportFee();
    }
}

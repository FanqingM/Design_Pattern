package musementpark.offline.base.service.servant;

import musementpark.util.Print;
import musementpark.util.PrintInfo;
/**
author: hzs
description:食品服务类
 */
public class FoodServiced implements IServiced{
    private boolean serviced = false;

    /**
     * 服务是否被执行
     * @return boolean
     */
    public boolean getServiced(){
        return serviced;
    }

    /**
     * 执行服务
     */
    public void setServiced(){
        serviced = true;
        Print.print(
                new PrintInfo(
                        "FoodServiced",
                        String.valueOf(System.identityHashCode(this)),
                        "setServiced",
                        "食品服务被执行"
                )
        );
    }
}
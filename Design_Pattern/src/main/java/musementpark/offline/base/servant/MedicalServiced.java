package musementpark.offline.base.servant;

import musementpark.util.Print;
import musementpark.util.PrintInfo;
/**
author: hzs
description:医疗服务类
 */
public class MedicalServiced implements IServiced{
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
                        "MedicalServiced",
                        String.valueOf(System.identityHashCode(this)),
                        "setServiced",
                        "医疗服务被执行"
                )
        );
    }
}
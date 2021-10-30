package musementpark.offline.base.service.servant;

import musementpark.util.Print;
import musementpark.util.PrintInfo;
/**
author: hzs
description:雇工类
 */
public class Servant {
    /**
     * 雇工执行服务
     * @param service
     */
    public void service(IServiced service){
        service.setServiced();
        Print.print(
                new PrintInfo(
                        "Servant",
                        String.valueOf(System.identityHashCode(this)),
                        "service",
                        "雇工执行服务"
                )
        );
    }
}
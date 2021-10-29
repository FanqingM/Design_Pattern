package musementpark.offline.base.service.servant;


/**
author: hzs
description:服务接口类
 */
public interface IServiced {

    /**
     * 服务是否被执行
     * @return boolean
     */
    public boolean getServiced();

    /**
     * 执行服务
     */
    public void setServiced();
}
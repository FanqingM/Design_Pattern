package musementpark.entertainment.decorator;


/*
author: CHS
description: 装饰者模式，新加保护功能的接口
 */
import musementpark.entertainment.template.template;

public interface IProtect extends ITemplate {
    void protectEquipment();
}

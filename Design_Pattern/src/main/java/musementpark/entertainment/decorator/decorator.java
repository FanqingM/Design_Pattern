package musementpark.entertainment.decorator;

/*
author: CHS
description: 装饰者模式，新加保护功能
 */
import musementpark.entertainment.template.template;
import musementpark.util.Log;
import musementpark.util.LogInfo;

public class decorator extends template implements IProtect{
    @Override
    public void RunGame() {
        System.out.println("RunRollerCoast->");
    }
    @Override
    public void protectEquipment() {
        System.out.println("protectEquipment->");
    }

    @Override
    public void Play() {
        checkFacility();
        checkTicket();
        intoScene();
        protectEquipment();
        RunGame();
        clearScene();
    }
}

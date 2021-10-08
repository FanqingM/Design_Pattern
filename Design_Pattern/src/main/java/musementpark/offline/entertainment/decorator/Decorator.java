package musementpark.offline.entertainment.decorator;

/*
author: CHS
description: 装饰者模式，新加保护功能
 */
import musementpark.offline.entertainment.template.Template;

public class Decorator extends Template implements IProtect {

    @Override
    public void PlayGame() {
        System.out.println("RunRollerCoast");
    }

    @Override
    public void protectEquipment() {
        System.out.println("protectEquipment");
    }

    @Override
    public void Run() {
        checkFacility();
        checkTicket();
        intoScene();
        protectEquipment();
        PlayGame();
        clearScene();
    }
}

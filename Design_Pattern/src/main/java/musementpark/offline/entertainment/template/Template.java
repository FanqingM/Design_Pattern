package musementpark.offline.entertainment.template;

/*
author: CHS
description: 模板模式，调用装饰者模式中的模板接口
 */
import musementpark.offline.entertainment.decorator.ITemplate;

public abstract class Template implements ITemplate {
    @Override
   public void checkFacility(){System.out.println("checkFacility");;};
    @Override
    public void checkTicket(){ System.out.println("checkTicket");};
    @Override
    public void intoScene(){ System.out.println("intoScene");};
    @Override
    public abstract void PlayGame();
    @Override
    public void clearScene(){  System.out.println("clearScene");};

    public  void Run(){
        checkFacility();
        checkTicket();
        intoScene();
        PlayGame();
        clearScene();
    }
}

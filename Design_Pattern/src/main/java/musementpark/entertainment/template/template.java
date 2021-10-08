package musementpark.entertainment.template;

/*
author: CHS
description: 模板模式，调用装饰者模式中的接口
 */
import musementpark.entertainment.decorator.ITemplate;

public abstract class template implements ITemplate {
    @Override
   public void checkFacility(){System.out.println("checkFacility->");;};
    @Override
    public void checkTicket(){ System.out.println("checkTicket->");};
    @Override
    public void intoScene(){ System.out.println("intoScene->");};
    @Override
    public abstract void RunGame();
    @Override
    public void clearScene(){  System.out.println("clearScene");};

    public  void Play(){
        checkFacility();
        checkTicket();
        intoScene();
        RunGame();
        clearScene();
    }
}

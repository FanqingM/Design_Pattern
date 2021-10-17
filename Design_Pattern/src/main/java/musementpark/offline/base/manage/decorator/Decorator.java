package musementpark.offline.base.manage.decorator;

import musementpark.offline.base.manage.composite.ComponentManage;
import musementpark.offline.base.manage.composite.CompositeManage;
import musementpark.offline.base.manage.composite.LeafManage;

public class Decorator extends ComponentManage {

    private String deco;
    public Decorator(String position,String content,String deco){
        super(position, content);
        this.deco=deco;
    }

    public void setDeco() {
        dowork();
        System.out.println("my decorator is:"+deco);
    }

    @Override
    public void check() {

    }


}

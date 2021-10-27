package musementpark.offline.base.manage.decorator;

/**
 *author:1952396
 *description:add decorator to managers and clark
 */

import musementpark.offline.base.manage.composite.ComponentManage;
import musementpark.offline.base.manage.composite.CompositeManage;
import musementpark.offline.base.manage.composite.LeafManage;

public class Decorator extends ComponentManage {

    private String deco;

    /**
     * 构造函数
     * @param position
     * @param content
     * @param deco
     */
    public Decorator(String position,String content,String deco){
        super(position, content);
        this.deco=deco;
    }

    /**
     * 输出装饰语句
     */
    public void setDeco() {
        dowork();
        System.out.println("my decorator is:"+deco);
    }

    /**
     * 对于check函数decorator不必调用
     */
    @Override
    public void check() {}


}

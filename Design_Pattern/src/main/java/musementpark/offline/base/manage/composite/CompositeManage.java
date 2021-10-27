package musementpark.offline.base.manage.composite;

/**
 *author: 1952396
 *description: manager's class
 */

import java.util.ArrayList;
import java.util.List;


public class CompositeManage extends ComponentManage{

    private List<ComponentManage> componentmanages =new ArrayList<>();

    /**
     * 构造函数
     * @param position
     * @param content
     */
    public CompositeManage(String position,String content){
        super(position, content);
    }

    /**
     * 增加人员
     * @param componentmanage
     */
    public void addComponent(ComponentManage componentmanage){
        componentmanages.add(componentmanage);
    }

    /**
     * 减少人员
     * @param componentmanage
     */
    public void removeComponent(ComponentManage componentmanage){
        componentmanages.remove(componentmanage);
    }

    /**
     * 依次输出不同人员的position&content
     */
    @Override
    public void check(){
        dowork();
        for(ComponentManage componentmanage:componentmanages){
            componentmanage.check();
        }
    }
}

package musementpark.offline.base.manage.composite;

/*
author: 1952396
description: manager's class
 */

import java.util.ArrayList;
import java.util.List;


public class CompositeManage extends ComponentManage{

    private List<ComponentManage> componentmanages =new ArrayList<>();

    public CompositeManage(String position,String content){
        super(position, content);
    }

    public void addComponent(ComponentManage componentmanage){
        componentmanages.add(componentmanage);
    }

    public void removeComponent(ComponentManage componentmanage){
        componentmanages.remove(componentmanage);
    }

    @Override
    public void check(){
        dowork();
        for(ComponentManage componentmanage:componentmanages){
            componentmanage.check();
        }
    }
}

package musementpark.offline.entertainment.visitor;

/*
author: CHS
description: 维修者类
 */
import musementpark.offline.entertainment.template.Template;

public class Repairman implements IVisitor{
    @Override
    public void visitor(Template template) {
        System.out.println("修理师进行了");
        template.checkFacility();
    }
}

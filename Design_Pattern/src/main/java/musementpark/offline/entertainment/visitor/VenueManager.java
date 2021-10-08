package musementpark.offline.entertainment.visitor;

/*
author: CHS
description: 场地负责人类
 */
import musementpark.offline.entertainment.template.Template;

public class VenueManager implements IVisitor{
    @Override
    public void visitor(Template template) {
        System.out.println("场地管理员进行了");
        template.checkTicket();
        template.clearScene();
    }
}

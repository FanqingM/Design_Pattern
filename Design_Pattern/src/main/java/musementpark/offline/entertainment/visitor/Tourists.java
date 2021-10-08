package musementpark.offline.entertainment.visitor;

/*
author: CHS
description: 游客类
 */
import musementpark.offline.entertainment.template.Template;

public class Tourists implements IVisitor{

    @Override
    public void visitor(Template template) {
      System.out.println("游客进行了");
      template.intoScene();
      template.PlayGame();
    }

}

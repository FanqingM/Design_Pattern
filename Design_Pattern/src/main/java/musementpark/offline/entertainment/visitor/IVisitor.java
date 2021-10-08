package musementpark.entertainment.visitor;

import musementpark.entertainment.decorator.IProtect;
import musementpark.entertainment.template.Template;

public interface IVisitor  {

   void visitor(Template template);
}

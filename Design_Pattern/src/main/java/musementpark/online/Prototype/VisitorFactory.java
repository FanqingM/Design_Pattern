package musementpark.online.Prototype;

public class VisitorFactory {
    private VisitorFactory _singleton = new VisitorFactory();
    private VisitorFactory(){}
    public VisitorFactory getInstance()
    {
        return _singleton;
    }

    Visitor getVisitor(String type)
    {
        Visitor result = Visitor.findAndClone(type);
        if(result==null)
        {
            return Visitor.findAndClone("NULLVISITOR");
        }
        return result;
    }
}

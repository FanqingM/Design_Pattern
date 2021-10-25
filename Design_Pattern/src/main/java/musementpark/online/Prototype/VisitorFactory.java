package musementpark.online.Prototype;

public class VisitorFactory {
    private static VisitorFactory _singleton = new VisitorFactory();
    private VisitorFactory(){}
    public static VisitorFactory getInstance()
    {
        return _singleton;
    }

    public Visitor getVisitor(String type)
    {
        Visitor result = Visitor.findAndClone(type);
        if(result==null)
        {
            return Visitor.findAndClone("NULLVISITOR");
        }
        return result;
    }
}

package musementpark.online.Prototype;
/**
 * author: DannyXSC
 * description: VisitorFactory工厂类采用了简单工厂设计模式来生成具体类型的Visitor，同时该工厂也是单例模式
 */
public class VisitorFactory {
    private static VisitorFactory _singleton = new VisitorFactory();

    /**
     * description: 私有构造函数，供生成_singleton唯一实例时调用
     */
    private VisitorFactory(){}

    /**
     * description: 供外部调用，获取该类的唯一实例_singleton
     * @return
     */
    public static VisitorFactory getInstance()
    {
        return _singleton;
    }

    /**
     * description: 根据传入的type类型生成具体的Visitor
     * @param type 具体Visitor子类的名称
     * @return 返回一个Visitor类型的引用
     */
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

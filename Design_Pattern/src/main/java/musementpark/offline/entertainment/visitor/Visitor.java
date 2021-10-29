package musementpark.offline.entertainment.visitor;
import musementpark.offline.entertainment.composite.Composite;
import musementpark.offline.entertainment.composite.Leaf;

/**
 * 访问者接口
 * @date 2016年2月29日
 */
public interface Visitor {

    /**
     * 访问组合对象
     * @param composite
     */
    void visitComposite(Composite composite);

    /**
     * 访问叶子对象
     * @param leaf
     */
    void visitLeaf(Leaf leaf);

}
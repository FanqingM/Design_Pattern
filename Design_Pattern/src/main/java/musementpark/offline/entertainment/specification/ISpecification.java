package musementpark.offline.entertainment.specification;

/**
 * author：FanqingM
 * description：系统调用该接口构造复杂限制
 */
public interface ISpecification {

    boolean isSatisfiedBy(Visitor visitor);

    /**
     * and操作
     * @param spec
     * @return
     */
    ISpecification and(ISpecification spec);

    /**
     * or操作
     * @param spec
     * @return
     */
    ISpecification or(ISpecification spec);

    /**
     * not操作
     * @return
     */
    ISpecification not();
}
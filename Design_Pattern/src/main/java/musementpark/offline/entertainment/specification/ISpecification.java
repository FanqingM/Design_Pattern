package musementpark.offline.entertainment.specification;


public interface ISpecification {

    boolean isSatisfiedBy(Visitor visitor);

    /**
     * and操作
     *
     * @param spec
     * @return
     */
    ISpecification and(ISpecification spec);

    /**
     * or操作
     *
     * @param spec
     * @return
     */
    ISpecification or(ISpecification spec);

    /**
     * not操作
     *
     * @return
     */
    ISpecification not();
}
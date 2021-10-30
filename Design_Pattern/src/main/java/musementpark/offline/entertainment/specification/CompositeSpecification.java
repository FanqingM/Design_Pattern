package musementpark.offline.entertainment.specification;

/**
 * author：FanqingM
 * description：复合限制抽象类，调用基本逻辑关系，通过基本限制构造复杂限制
 */
public abstract class CompositeSpecification implements ISpecification {
    /**
     * 限制的与关系接口
     * @param spec
     * @return
     */
    @Override
    public ISpecification and(ISpecification spec) {
        return new AndSpecification(this, spec);
    }

    /**
     * 限制的或关系接口
     * @param spec
     * @return
     */
    @Override
    public ISpecification or(ISpecification spec) {
        return new OrSpecification(this, spec);
    }

    /**
     * 限制的否关系接口
     * @return
     */
    @Override
    public ISpecification not() {
        return new NotSpecification(this);
    }
}
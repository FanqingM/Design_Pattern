package musementpark.offline.entertainment.specification;
/**
 * author：FanqingM
 * description：限制中的否关系
 */

public class NotSpecification extends CompositeSpecification {
    // 传递一个规格书
    private ISpecification spec;

    /**
     * 构造函数，否关系
     * @param spec
     */
    public NotSpecification(ISpecification spec) {
        this.spec = spec;
    }

    /**
     * 监测是否满足限制的否定
     * @param visitor
     * @return
     */
    @Override
    public boolean isSatisfiedBy(Visitor visitor) {
        boolean res = !this.isSatisfiedBy(visitor);
        if(res)
        {
            System.out.println(visitor.name + "通过");
        }
        else
        {
            System.out.println(visitor.name + "不通过");
        }
        return !this.isSatisfiedBy(visitor);
    }

}


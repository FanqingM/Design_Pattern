package musementpark.offline.entertainment.specification;
/**
 * author：FanqingM
 * description：限制中的或关系
 */

public class OrSpecification extends CompositeSpecification {
    // 左右两个规格书
    private ISpecification left;
    private ISpecification right;

    /**
     * 构造限制，或关系
     * @param left
     * @param right
     */
    public OrSpecification(ISpecification left, ISpecification right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 监测是否满足两个限制之一
     * @param visitor
     * @return
     */
    @Override
    public boolean isSatisfiedBy(Visitor visitor) {
        boolean res = this.left.isSatisfiedBy(visitor) || this.right.isSatisfiedBy(visitor);
        if(res)
        {
            System.out.println(visitor.name + "通过");
        }
        else
        {
            System.out.println(visitor.name + "不通过");
        }
        return this.left.isSatisfiedBy(visitor) || this.right.isSatisfiedBy(visitor);
    }

}

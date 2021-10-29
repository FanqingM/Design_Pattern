package musementpark.offline.entertainment.specification;

import musementpark.util.Print;
import musementpark.util.PrintInfo;
/**
 * author：FanqingM
 * description：限制中的与关系
 */
public class AndSpecification extends CompositeSpecification {
    // 传递两个规格书进行and操作
    private ISpecification left;
    private ISpecification right;

    /**
     * 构造函数
     * @param left
     * @param right
     */
    public AndSpecification(ISpecification left, ISpecification right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 监测是否满足两个限制的要求
     * @param visitor
     * @return
     */
    @Override
    public boolean isSatisfiedBy(Visitor visitor) {
        boolean res = this.left.isSatisfiedBy(visitor) && this.right.isSatisfiedBy(visitor);
        if(res)
        {
            Print.print(
                    new PrintInfo(
                            "AndSpecification",
                            String.valueOf(System.identityHashCode(this)),
                            "isSatisfiedBy",
                            visitor.name + "通过"
                    )
            );
        }
        else
        {
            Print.print(
                    new PrintInfo(
                            "AndSpecification",
                            String.valueOf(System.identityHashCode(this)),
                            "isSatisfiedBy",
                            visitor.name + "不通过"
                    )
            );
        }
        return this.left.isSatisfiedBy(visitor) && this.right.isSatisfiedBy(visitor);
    }

}


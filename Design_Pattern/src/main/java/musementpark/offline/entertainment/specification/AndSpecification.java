package musementpark.offline.entertainment.specification;


import musementpark.util.Print;
import musementpark.util.PrintInfo;

public class AndSpecification extends CompositeSpecification {
    // 传递两个规格书进行and操作
    private ISpecification left;
    private ISpecification right;

    public AndSpecification(ISpecification left, ISpecification right) {
        this.left = left;
        this.right = right;
    }

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


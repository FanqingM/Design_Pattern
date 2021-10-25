package musementpark.offline.entertainment.specification;




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
            System.out.println(visitor.name + "通过");
        }
        else
        {
            System.out.println(visitor.name + "不通过");
        }
        return this.left.isSatisfiedBy(visitor) && this.right.isSatisfiedBy(visitor);
    }

}


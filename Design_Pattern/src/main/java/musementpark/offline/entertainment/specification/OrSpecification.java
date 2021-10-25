package musementpark.offline.entertainment.specification;




public class OrSpecification extends CompositeSpecification {
    // 左右两个规格书
    private ISpecification left;
    private ISpecification right;

    public OrSpecification(ISpecification left, ISpecification right) {
        this.left = left;
        this.right = right;
    }

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

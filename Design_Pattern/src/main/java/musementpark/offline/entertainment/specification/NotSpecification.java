package musementpark.offline.entertainment.specification;




public class NotSpecification extends CompositeSpecification {
    // 传递一个规格书
    private ISpecification spec;

    public NotSpecification(ISpecification spec) {
        this.spec = spec;
    }

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


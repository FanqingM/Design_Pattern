package musementpark.offline.entertainment.specification;

public class WeightLessSpec extends CompositeSpecification{
    private int weight;
    public WeightLessSpec(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean isSatisfiedBy(Visitor visitor) {
        boolean res = this.weight > visitor.weight;
//        if(res)
//        {
//            System.out.println(visitor.name + "体重过大");
//        }
//        else
//        {
//            System.out.println(visitor.name + "通过");
//        }
        return res;
    }
}

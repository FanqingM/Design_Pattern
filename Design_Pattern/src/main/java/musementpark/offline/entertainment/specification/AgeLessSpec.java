package musementpark.offline.entertainment.specification;

public class AgeLessSpec extends CompositeSpecification{
    private int age;
    public AgeLessSpec(int age) {
        this.age = age;
    }

    @Override
    public boolean isSatisfiedBy(Visitor visitor) {
        boolean res = this.age > visitor.age;
//        if(res)
//        {
//            System.out.println(visitor.name + "年龄过大");
//        }
//        else
//        {
//            System.out.println(visitor.name + "通过");
//        }
        return res;
    }
}

package musementpark.offline.entertainment.specification;
/**
 * author：FanqingM
 * description：构造年龄限制
 */
public class AgeLessSpec extends CompositeSpecification{
    private int age;

    /**
     * 构造函数，给定年龄
     * @param age
     */
    public AgeLessSpec(int age) {
        this.age = age;
    }

    /**
     * 监测是否满足限制
     * @param visitor
     * @return
     */
    @Override
    public boolean isSatisfiedBy(Visitor visitor) {
        boolean res = this.age > visitor.age;
        return res;
    }
}

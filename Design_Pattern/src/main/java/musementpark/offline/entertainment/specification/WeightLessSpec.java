package musementpark.offline.entertainment.specification;
/**
 * author：FanqingM
 * description：构造体重限制类
 */
public class WeightLessSpec extends CompositeSpecification{
    private int weight;

    /**
     * 构造体重限制类
     * @param weight
     */
    public WeightLessSpec(int weight) {
        this.weight = weight;
    }

    /**
     * 监测是否满足体重限制
     * @param visitor
     * @return
     */
    @Override
    public boolean isSatisfiedBy(Visitor visitor) {
        boolean res = this.weight > visitor.weight;

        return res;
    }
}

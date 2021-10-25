package musementpark.offline.entertainment.specification;



/**
 * @param <T> 进行规约的类
 *            <p>
 *            两个规约进行链式操作 and 后产生的规约
 * @author HR8398Cephei
 */
public class AndSpecification<T> extends CompositeSpecification<T> {

    private final Specification<T> spec1;

    private final Specification<T> spec2;

    public AndSpecification(Specification<T> spec1, Specification<T> spec2) {
        this.spec1 = spec1;
        this.spec2 = spec2;
    }

    @Override
    public boolean isSatisfiedBy(T t) {
        boolean res = spec1.isSatisfiedBy(t) && spec2.isSatisfiedBy(t);


        return res;
    }
}

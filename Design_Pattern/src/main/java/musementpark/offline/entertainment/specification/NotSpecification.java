package musementpark.offline.entertainment.specification;



/**
 * @author HR8398Cephei
 * @param <T> 进行规约的类
 *
 * 规约进行链式操作 not 后产生的规约
 */
public class NotSpecification<T> extends CompositeSpecification<T> {

    private final Specification<T> spec;

    public NotSpecification(Specification<T> spec) {
        this.spec = spec;
    }

    @Override
    public boolean isSatisfiedBy(T t) {
        boolean res = !spec.isSatisfiedBy(t);


        return res;
    }
}

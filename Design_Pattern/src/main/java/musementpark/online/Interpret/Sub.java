package musementpark.online.Interpret;

public class Sub extends Operator {
    Sub(Expression left, Expression right){
        super(left, right);
    }
    @Override
    public Double intercept() {
        return left.intercept()-right.intercept();
    }
}

package musementpark.online.Interpret;

public class Multi extends Operator {
    Multi(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public Double intercept() {
        return left.intercept()*right.intercept();
    }
}

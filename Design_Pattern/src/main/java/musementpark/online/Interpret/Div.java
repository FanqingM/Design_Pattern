package musementpark.online.Interpret;

public class Div extends Operator {

    Div(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public Double intercept() {
        return left.intercept()/right.intercept();
    }
}

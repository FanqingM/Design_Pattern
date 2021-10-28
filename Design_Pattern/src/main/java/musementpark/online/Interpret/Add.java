package musementpark.online.Interpret;

public class Add extends Operator{
    Add(Expression left, Expression right){
        super(left, right);
    }

    @Override
    public Double intercept() {
        return left.intercept()+right.intercept();
    }
}

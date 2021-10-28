package musementpark.online.Interpret;

abstract class Operator implements Expression {
    Expression left;
    Expression right;

    Operator(Expression left, Expression right){
        this.left=left;
        this.right=right;
    }
}

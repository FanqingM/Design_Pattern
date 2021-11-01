package musementpark.online.interpret;

/**
 * author: PandaLYZ
 * description:该类为Operator类，其实现了Expression接口，并派生出加、减、乘、除四个具体的操作符类
 */
abstract class Operator implements Expression {
    Expression left;
    Expression right;

    /**
     * description: 构造函数，初始化两个操作数
     * @param left 用于初始化第一个操作数
     * @param right 用于初始化第二个操作数
     */
    Operator(Expression left, Expression right){
        this.left=left;
        this.right=right;
    }
}

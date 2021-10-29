package musementpark.online.Interpret;

/**
 * author: PandaLYZ
 * description:该类为Multi类，其继承了Operator操作类，具体实现对两个表达式相乘的操作
 */
public class Multi extends Operator {
    /**
     * description: 构造函数，初始化了父类中的两个操作数变量
     * @param left Expression类型，表示第一个操作数
     * @param right Expression类型，表示第一二操作数
     */
    Multi(Expression left, Expression right){
        super(left, right);
    }
    /**
     * description: 重写了接口中的intercept方法，返回对两个操作数相乘的结果
     * @return 返回对两个操作数相乘的结果
     */
    @Override
    public Double intercept() {
        return left.intercept()*right.intercept();
    }
}

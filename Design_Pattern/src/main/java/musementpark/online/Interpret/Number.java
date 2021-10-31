package musementpark.online.Interpret;
/**
 * author: PandaLYZ
 * description:该类为Number类，其实现了Expression接口，所有的操作数都为此类型
 */
public class Number implements Expression{
    Double number;

    /**
     * description: 构造函数,为number变量赋值
     * @param x Double类型
     */
    public Number(Double x){
        number=x;
    }

    /**
     * description: 重写了intercept方法
     * @return 返回具体的Double类型的数值
     */
    @Override
    public Double intercept() {
        return number;
    }
}

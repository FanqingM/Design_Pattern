package musementpark.offline.entertainment.specification;
/**
 * author：FanqingM
 * description：游客类
 */
public class Visitor {
    public String name;
    public int age;
    public int weight;

    /**
     * 游客的构造函数
     * @param name
     * @param age
     * @param weight
     */
    public Visitor(String name, int age,int weight)
    {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}

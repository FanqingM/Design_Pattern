package musementpark.offline.entertainment.flyweight;

import java.util.HashMap;

// 网站工厂类，根据需要返回压一个网站
public class MumaFactory {

    //集合， 充当池的作用
    private HashMap<String, ConcreteMuma> pool = new HashMap<>();

    //根据网站的类型，返回一个网站, 如果没有就创建一个网站，并放入到池中，并返回
    public Muma getMumaCategory(String type) {
        if(!pool.containsKey(type)) {
            //就创建一个网站，并放入到池中
            pool.put(type, new ConcreteMuma(type));
        }
        return (Muma)pool.get(type);
    }

    //获取网站分类的总数 (池中有多少个网站类型)
    public int getMumaCount() {
        return pool.size();
    }
}

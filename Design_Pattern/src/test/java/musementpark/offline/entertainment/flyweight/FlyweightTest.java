package musementpark.offline.entertainment.flyweight;

class FlyweightTest {
    public static void main(String[] args) {
        // 创建一个工厂类
        MumaFactory factory = new MumaFactory();

        Muma muma1 = factory.getMumaCategory("独角兽");
        muma1.use(new User("yellow","big"));


        Muma muma2 = factory.getMumaCategory("普通马");
        muma2.use(new User("yellow" ,"small"));


        Muma muma3 = factory.getMumaCategory("普通马");
        muma3.use(new User("red", "big"));


        Muma muma4 = factory.getMumaCategory("普通马");
        muma4.use(new User("green", "small"));
        System.out.println("木马的分类共=" + factory.getMumaCount());
    }
}
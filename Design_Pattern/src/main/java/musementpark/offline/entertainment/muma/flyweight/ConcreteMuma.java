package musementpark.offline.entertainment.muma.flyweight;

//具体网站
public class ConcreteMuma extends Muma {

    //共享的部分，内部状态
    private String type = ""; //类型，内部状态，可以共享

    //构造器
    public ConcreteMuma(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("木马类型为:" + type + " 外部状态为" + user.getSize() + user.getColor());
    }
}

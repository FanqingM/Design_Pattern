package musementpark.online.Prototype;

public class Child extends Visitor{
    private static final Child _child = new Child();

    private Child(){addPrototype(this);}

    private Child(int dump){}

    @Override
    public Child clone() {
        return new Child(1);
    }

    @Override
    public void playWhirligig() {
        _restrict.playWhirligig("儿童");
    }

    @Override
    public void playKarting() {
        _restrict.playKarting("儿童");
    }
}

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
    public void getStatus() {
        System.out.println("child的地位是"+_status.getClass().getSimpleName()+",对应折扣是"+_status.getDiscount());
    }

    @Override
    public boolean isNull() {
        return false;
    }
}

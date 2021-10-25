package musementpark.online.Prototype;

public class Adult extends Visitor{
    private static final Adult _adult = new Adult();

    private Adult(){addPrototype(this);}

    private Adult(int dump){}

    @Override
    public Adult clone() {
        return new Adult(1);
    }

    @Override
    public void getStatus() {
        System.out.println("adult的地位是"+_status.getClass().getSimpleName()+",对应折扣是"+_status.getDiscount());
    }

    @Override
    public boolean isNull() {
        return false;
    }
}

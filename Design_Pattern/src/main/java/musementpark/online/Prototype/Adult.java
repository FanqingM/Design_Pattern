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
    public boolean isNull() {
        return false;
    }
}

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
    public void playWhirligig() {
        _restrict.playWhirligig("成人");
    }

    @Override
    public void playKarting() {
        _restrict.playKarting("成人");
    }
}

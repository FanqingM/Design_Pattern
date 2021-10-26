package musementpark.offline.base.rides.lock;

public class Rides {

    public int num;
    public String name;
    private final int count;
    private final Lock lock;


    public Rides(int num, String name,Lock lock) {
        this.num = num;
        this.name = name;
        this.count=num;
        this.lock=lock;
    }

    public boolean peoplep() {
        if (num>0) {
            num=num-1;
            return true;
        }
        else{
            return false;
        }
    }

    public void peopled() {
        num=count;
    }
    public void playing(){
        try{
            lock.acquire();
        }
        catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.release();
        }
    }
}

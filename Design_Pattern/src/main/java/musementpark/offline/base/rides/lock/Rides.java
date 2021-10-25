package musementpark.offline.base.rides.lock;

public class Rides {

    public int num;
    public String name;
    private int count;
    private final Lock lock;


    public Rides(int num, String name,Lock lock) {
        this.num = num;
        this.name = name;
        this.count=num;
        this.lock=lock;
    }

    public boolean peoplep() {
        boolean success = false;
        if (num>0) {
            num=num-1;
            success = true;
            return success;
        }
        else{
            return false;
        }
    }

    public boolean peopled() {
        boolean success = false;
        num=count;
        success = true;
        return success;
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

package musementpark.offline.base.rides.lock;

/**
 * author:1952396
 * description:
 */

public class Rides {

    public int num;
    public String name;
    private final int count;
    private final Lock lock;

    /**
     *
     * @param num
     * @param name
     * @param lock
     */
    public Rides(int num, String name,Lock lock) {
        this.num = num;
        this.name = name;
        this.count=num;
        this.lock=lock;
    }

    /**
     *
     * @return
     */
    public boolean peoplep() {
        if (num>0) {
            num=num-1;
            return true;
        }
        else{
            return false;
        }
    }

    /**
     *
     */
    public void peopled() {
        num=count;
    }

    /**
     *
     */
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

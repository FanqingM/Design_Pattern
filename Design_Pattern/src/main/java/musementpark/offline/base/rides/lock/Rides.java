package musementpark.offline.base.rides.lock;

/**
 * author:1952396
 * description:游乐设施类
 */

public class Rides {

    public int num;
    public String name;
    private final int count;
    private final Lock lock;

    /**
     * 游乐设施的构造
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
     * 游客游玩游乐设施,座位减少
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
     * 游玩结束，游客离开，释放座位
     */
    public void peopled() {
        num=count;
    }

    /**
     * 游乐设施正在运行时锁住，不允许游玩者进入游乐设施
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

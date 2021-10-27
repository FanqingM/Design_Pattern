package musementpark.offline.base.rides.lock;

 /**
 * author:1952396
 * description:互斥锁的实现
 */

public class Mutex implements Lock{
    private Object owner;

     /**
      * acquire函数的实现
      * @throws InterruptedException
      */
    @Override
    public synchronized void acquire() throws InterruptedException {
        while(owner != null){
            wait();
        }

        owner = Thread.currentThread();
    }

     /**
      * release函数的实现
      */
    @Override
    public synchronized void release() {
        if(Thread.currentThread() == owner){
            owner = null;
            notify();
        }
    }

     /**
      * 构造互斥对象
      * @return
      */
    public Object getOwner(){
        return owner;
    }
}

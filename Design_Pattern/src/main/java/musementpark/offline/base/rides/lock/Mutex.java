package musementpark.offline.base.rides.lock;

 /**
 * author:1952396
 * description:
 */

public class Mutex implements Lock{
    private Object owner;

     /**
      * acquire
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
      * release
      */
    @Override
    public synchronized void release() {
        if(Thread.currentThread() == owner){
            owner = null;
            notify();
        }
    }

     /**
      *
      * @return
      */
    public Object getOwner(){
        return owner;
    }
}

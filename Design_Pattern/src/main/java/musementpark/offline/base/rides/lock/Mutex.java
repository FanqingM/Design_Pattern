package musementpark.offline.base.rides.lock;

public class Mutex implements Lock{
    private Object owner;

    @Override
    public synchronized void acquire() throws InterruptedException {
        while(owner != null){
            wait();
        }

        owner = Thread.currentThread();
    }

    @Override
    public synchronized void release() {
        if(Thread.currentThread() == owner){
            owner = null;
            notify();
        }
    }

    public Object getOwner(){
        return owner;
    }
}

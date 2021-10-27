package musementpark.offline.base.rides.lock;

public interface Lock {
    void acquire() throws InterruptedException;
    void release();
}

package musementpark.offline.base.rides.lock;

/**
 * author:1952396
 * description:interface of mutex
 */
public interface Lock {
    /**
     * acquire free resources
     * @throws InterruptedException
     */
    void acquire() throws InterruptedException;

    /**
     * release occupied resources
     */
    void release();
}

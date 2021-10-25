package musementpark.offline.base.rides.lock;

import org.junit.jupiter.api.Test;

public class LockTest {
    @Test
    void testLock(){
        String car="pengpengche";
        String house="xuanzhuanmuma";
        Mutex mutex = new Mutex();
        Mutex mutex1=new Mutex();
        Rides rides1 =new Rides(9,car,mutex1);
        Visitor visitor2 = new Visitor("p2",mutex, rides1);
        Visitor visitor1 = new Visitor("p1",mutex, rides1);
        Visitor visitor3 = new Visitor("p3",mutex, rides1);
        Visitor visitor4 = new Visitor("p4",mutex, rides1);
        Visitor visitor5 = new Visitor("p5",mutex, rides1);
        Visitor visitor6 = new Visitor("p6",mutex, rides1);
        visitor2.start();
        visitor6.start();
        visitor1.start();
        visitor3.start();
        visitor4.start();
        visitor5.start();
    }
}

package musementpark.offline.base.rides.lock;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class LockTest {
    @Test
    void testLock(){
        String dodgem="dodgem";
        String carousel="carousel";
        String Drop_Tower="Drop Tower";
        Mutex mutex = new Mutex();
        Mutex mutex1=new Mutex();
        Mutex mutex2=new Mutex();
        Mutex mutex3=new Mutex();
        Rides rides1 =new Rides(15,dodgem,mutex1);
        Rides rides2 =new Rides(15,carousel,mutex2);
        Rides rides3 =new Rides(15,Drop_Tower,mutex3);
        List<Rides> crides1 =new ArrayList<Rides>();
        crides1.add(rides1);
        crides1.add(rides2);
        List<Rides> crides2 =new ArrayList<Rides>();
        crides2.add(rides1);
        crides2.add(rides2);
        crides2.add(rides3);
        Visitor visitor2 = new Visitor("p2",mutex, crides1);
        Visitor visitor1 = new Visitor("p1",mutex, crides1);
        Visitor visitor3 = new Visitor("p3",mutex, crides2);
        Visitor visitor4 = new Visitor("p4",mutex, crides2);
        visitor2.start();
        visitor1.start();
        visitor3.start();
        visitor4.start();
    }
}

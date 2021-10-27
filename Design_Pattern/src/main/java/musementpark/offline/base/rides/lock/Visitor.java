package musementpark.offline.base.rides.lock;



import java.util.ArrayList;
import java.util.List;

public class Visitor extends Thread {

    public final String name;

    private final Lock lock;

    private List<Rides> rides;

    public Visitor(String name, Lock lock,List rides){
        this.name = name;
        this.rides= rides;
        this.lock=lock;
    }

    @Override
    public void run() {
        for(Rides ride:rides) {
            try {
                do {
                    ride.peoplep();
                }
                while (!ride.peoplep());
                lock.acquire();
                System.out.println(name + " buys a " + ride.name + " ticket");
                ride.playing();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.release();
                String msg2 = ride.name + " is played by " + name;
                System.out.println(msg2);
                ride.peopled();
            }
        }
        }
    }


package musementpark.offline.base.rides.lock;
/**
 * author:1952396
 * description:游客类
 */

import java.util.List;

public class Visitor extends Thread {

    public final String name;

    private final Lock lock;

    private List<Rides> rides;

    /**
     * 游客构造函数，包含游客的游玩线路
     * @param name
     * @param lock
     * @param rides
     */
    public Visitor(String name, Lock lock,List rides){
        this.name = name;
        this.rides= rides;
        this.lock=lock;
    }


    /**
     * 游客进行游玩，使用互斥锁，限制游客在一台游乐设施游玩时不会再出现在另一台
     */
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


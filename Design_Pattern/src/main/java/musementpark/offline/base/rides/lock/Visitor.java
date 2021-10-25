package musementpark.offline.base.rides.lock;

public class Visitor extends Thread {

    public final String name;

    private final Lock lock;

    private final Rides rides;

    public Visitor(String name, Lock lock,Rides rides){
        this.name = name;
        this.rides = rides;
        this.lock=lock;
    }

    @Override
    public void run() {
        try {
            do {
                rides.peoplep();
            }
            while(!rides.peoplep());
            lock.acquire();
            System.out.println(name+" buys a "+rides.name+" ticket");
            rides.playing();
        }
        catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.release();
            String msg2 = rides.name + " is played by " + name;
            System.out.println(msg2);
            rides.peopled();
            }
            }
        }

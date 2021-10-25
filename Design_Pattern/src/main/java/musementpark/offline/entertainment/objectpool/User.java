package musementpark.offline.entertainment.objectpool;

public class User {
   String name;
   Shooting shooting;

    public User(String name, Shooting shooting) {
        this.name = name;
        this.shooting = shooting;
    }

    public void BorrowShooting(ShootingPool shootingPool) {
       shooting = shootingPool.getShooting();
       System.out.println(name+" is palying shooting");
   }
   public void ReturnShooting(ShootingPool shootingPool) {
       shootingPool.returnShooting(shooting);
       System.out.println(name+" return shooting");
   }
}

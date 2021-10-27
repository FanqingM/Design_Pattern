package musementpark.offline.entertainment.objectpool;

/**
 * author:CaoHS
 * description:射击场使用者类
 */
public class User {
   String name;
   Shooting shooting;

    public User(String name, Shooting shooting) {
        this.name = name;
        this.shooting = shooting;
    }

    /**
     * 从对象池中借出空闲对象并使用
     * @param shootingPool
     */
    public void BorrowShooting(ShootingPool shootingPool) {
       shooting = shootingPool.getShooting();
       System.out.println(name+"正在使用射击场");
   }

    /**
     * 归还对象到对象池中
     * @param shootingPool
     */
   public void ReturnShooting(ShootingPool shootingPool) {
       shootingPool.returnShooting(shooting);
       System.out.println(name+"已使用完射击场");
   }
}

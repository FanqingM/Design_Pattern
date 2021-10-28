package musementpark.offline.entertainment.objectpool;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

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
        String objectId=String.valueOf(System.identityHashCode(shootingPool));
        Print.print(
                new PrintInfo(
                        "射击场对象池类",
                        objectId,
                        "对象池模式",
                        "description"
                )
        );
       System.out.println(name+"正在使用射击场");
   }

    /**
     * 归还对象到对象池中
     * @param shootingPool
     */
   public void ReturnShooting(ShootingPool shootingPool) {
       shootingPool.returnShooting(shooting);
       String objectId=String.valueOf(System.identityHashCode(shootingPool));
       Print.print(
               new PrintInfo(
                       "射击场对象池类",
                       objectId,
                       "对象池模式",
                       "description"
               )
       );
       System.out.println(name+"已使用完射击场");
   }
}

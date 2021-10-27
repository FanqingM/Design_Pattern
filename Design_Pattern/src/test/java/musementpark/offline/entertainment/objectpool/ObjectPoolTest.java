package musementpark.offline.entertainment.objectpool;

import musementpark.util.Print;
import musementpark.util.PrintInfo;
/**
 * author:CaoHS
 * description:对象池模式测试类
 */
public class ObjectPoolTest {
    public static void main(String[] args) throws Exception {
        ShootingPool shootingPool = new ShootingPool();
        shootingPool.createPool();
        String objectId=String.valueOf(System.identityHashCode(shootingPool));
        Print.print(
                new PrintInfo(
                        "射击场对象池类",
                        objectId,
                        "对象池模式",
                        "description"
                )
        );
        User user1=new User("游客1",null);
        User user2=new User("游客2",null);
        User user3=new User("游客3",null);
        User user4=new User("游客4",null);
        user1.BorrowShooting(shootingPool);
        user2.BorrowShooting(shootingPool);
        user3.BorrowShooting(shootingPool);
        user4.BorrowShooting(shootingPool);
        user1.ReturnShooting(shootingPool);
        user2.ReturnShooting(shootingPool);
        user3.ReturnShooting(shootingPool);
        user4.ReturnShooting(shootingPool);
        shootingPool.closeShootingPool();
    }
}

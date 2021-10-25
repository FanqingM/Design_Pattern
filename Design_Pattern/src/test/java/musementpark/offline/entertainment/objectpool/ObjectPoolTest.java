package musementpark.offline.entertainment.objectpool;

public class ObjectPoolTest {
    public static void main(String[] args) throws Exception {
        ShootingPool shootingPool = new ShootingPool();
        shootingPool.createPool();
        User user1=new User("user1",null);
        User user2=new User("user2",null);
        User user3=new User("user3",null);
        User user4=new User("user4",null);
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

package musementpark.offline.entertainment.objectpool;

import java.util.Enumeration;
import java.util.Vector;
/**
 * author:CaoHS
 * description:射击场对象池类
 */
public class ShootingPool {
    private int numObjects = 3; // 对象池的大小
    private Vector shootings = null; //存放对象池中对象的向量( PooledObject类型)

    public ShootingPool() {
    }

    /**
     *  创建一个对象池
     */
    public  void createPool() {
        if (shootings != null) {
            return;
        }
        shootings = new Vector();
        // 根据 numObjects 中设置的值，循环创建指定数目的对象
        for (int i = 0; i < numObjects; i++) {
            Shooting obj = new Shooting("枪","子弹","靶子");
            shootings.addElement(new PooledObject(obj));
        }
    }

    /**
     * 获取到对象池中一个空闲对象,若没有，则等待
     * @return freeShooting
     */
    public  Shooting getShooting() {
        // 对象池还没创建，则返回null
        if (shootings == null) {
            return null;
        }
        // 获得一个空闲对象
        Shooting freeShooting = getFreeShooting();
        // 如果目前没有空闲对象，重新再试，直到获得可用的对象
        if (freeShooting == null) {
            System.out.println("请等待");
        }
        return freeShooting;
    }

    /**
     * 获取对象池中一个此时空闲的对象
     * @return freeShooting
     */
    private Shooting getFreeShooting() {

        // 从对象池中获得一个可用的对象
        Shooting freeShooting = findFreeShooting();
        // 如果创建对象后仍获得不到可用的对象，则返回 null
        if (freeShooting == null) {
            return null;
        }
        return freeShooting;
    }

    /**
     * 查找对象池中所有的对象，查找一个可用的对象，如果没有可用的对象，返回 null
     * @return freeShooting
     */
    private Shooting findFreeShooting() {

        Shooting freeShooting = null;
        PooledObject pObj = null;
        // 获得对象池向量中所有的对象
        Enumeration enumerate = shootings.elements();

        while (enumerate.hasMoreElements()) {
            pObj = (PooledObject) enumerate.nextElement();
            if (!pObj.isBusy()) {
                freeShooting = pObj.getShooting();
                pObj.setBusy(true);
                return freeShooting;
            }
        }
        return freeShooting;
    }

    /**
     * 归还一个对象到对象池中
     * @param shooting
     */
    public void returnShooting(Shooting shooting) {
        // 确保对象池存在
        if (shootings == null) {
            return;
        }
        PooledObject pObj = null;
        Enumeration enumerate = shootings.elements();

        // 遍历对象池中的所有对象，找到这个要返回的对象
        while (enumerate.hasMoreElements()) {
            pObj = (PooledObject) enumerate.nextElement();
            // 先找到对象池中的要返回的对象
            if (shooting == pObj.getShooting()) {
                // 找到了,设置此对象为空闲状态
                pObj.setBusy(false);
                break;
            }
        }
    }

    /**
     * 关闭对象池中所有的对象，并清空对象池。
     */
    public void closeShootingPool() {

        // 确保对象池存在
        if (shootings == null) {
            return;
        }
        PooledObject pObj = null;
        Enumeration enumerate = shootings.elements();

        while (enumerate.hasMoreElements()) {
            pObj = (PooledObject) enumerate.nextElement();
            // 如果忙，等 5 秒
            if (pObj.isBusy()) {
                wait(5000);
            }
            // 从对象池向量中删除它
            shootings.removeElement(pObj);
        }
        // 置对象池为空
        shootings = null;
    }

    /**
     *  设置程序等待给定的毫秒数
     * @param mSeconds
     */
    private void wait(int mSeconds) {
        try {
            Thread.sleep(mSeconds);
        } catch (InterruptedException e) {
        }
    }
}

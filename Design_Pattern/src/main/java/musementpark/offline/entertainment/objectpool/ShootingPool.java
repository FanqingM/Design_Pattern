package musementpark.offline.entertainment.objectpool;

import java.util.Enumeration;
import java.util.Vector;

public class ShootingPool {
    private int numObjects = 3; // 对象池的大小
    private Vector shootings = null; //存放对象池中对象的向量( PooledObject类型)

    public ShootingPool() {
    }

    /*** 创建一个对象池***/
    public synchronized void createPool() {
        if (shootings != null) {
            return;
        }
        shootings = new Vector();

        // 根据 numObjects 中设置的值，循环创建指定数目的对象
        for (int x = 0; x < numObjects; x++) {
            if (shootings.size() == 0) {
                Shooting obj = new Shooting("枪","子弹","靶子");
                shootings.addElement(new PooledObject(obj));
            }
        }
    }

    public synchronized Shooting getShooting() {
        if (shootings == null) {
            return null; // 对象池还没创建，则返回 null
        }
        Shooting freeShooting = getFreeShooting(); // 获得一个可用的对象

        // 如果目前没有可以使用的对象，即所有的对象都在使用中
        while (freeShooting == null) {
            wait(250);
            freeShooting = getFreeShooting(); // 重新再试，直到获得可用的对象，如果
        }

        return freeShooting;
    }

    /**
     * 本函数从对象池对象中返回一个可用的的对象
     */
    private Shooting getFreeShooting() {

        // 从对象池中获得一个可用的对象
        Shooting obj = findFreeShooting();
        // 如果创建对象后仍获得不到可用的对象，则返回 null
        if (obj == null) {
            System.out.println("no free shooting,please wait for a moment");
            return null;
        }
        return obj;
    }

    /**
     * 查找对象池中所有的对象，查找一个可用的对象，
     * 如果没有可用的对象，返回 null
     */
    private Shooting findFreeShooting() {

        Shooting obj = null;
        PooledObject pObj = null;

        // 获得对象池向量中所有的对象
        Enumeration enumerate = shootings.elements();

        while (enumerate.hasMoreElements()) {
            pObj = (PooledObject) enumerate.nextElement();
            if (!pObj.isBusy()) {
                obj = pObj.getShooting();
                pObj.setBusy(true);
            }
        }
        return obj;
    }


    /**
     * 此函数返回一个对象到对象池中
     */

    public void returnShooting(Shooting obj) {

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
            if (obj == pObj.getShooting()) {
                // 找到了,设置此对象为空闲状态
                pObj.setBusy(false);
                break;
            }
        }
    }


    /**
     * 关闭对象池中所有的对象，并清空对象池。
     */
    public synchronized void closeShootingPool() {

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
                wait(5000); // 等 5 秒
            }
            // 从对象池向量中删除它
            shootings.removeElement(pObj);
        }

        // 置对象池为空
        shootings = null;
    }


    /**
     * 使程序等待给定的毫秒数
     */
    private void wait(int mSeconds) {
        try {
            Thread.sleep(mSeconds);
        } catch (InterruptedException e) {
        }
    }


}

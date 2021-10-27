package musementpark.offline.entertainment.objectpool;

/**
 * author:CaoHS
 * description:内部使用的用于保存对象池中对象的类。
 */
public class PooledObject {

    Shooting shooting = null;// 对象
    boolean isBusy = false; // 此对象是否正在使用

    public PooledObject(Shooting shooting) {
        this.shooting = shooting;
    }

    public Shooting getShooting() {
        return shooting;
    }

    public void setShooting(Shooting shooting) {
        this.shooting = shooting;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean isBusy) {
        this.isBusy = isBusy;
    }
}

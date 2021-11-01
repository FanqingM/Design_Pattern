package musementpark.offline.entertainment.objectpool;

import java.util.List;

/**
 * author:CaoHS
 * description:单个射击场作为对象池的对象
 */
public class Shooting {
    String shot;//枪
    String bullet;//子弹
    String target;//靶子

    public Shooting(String shot, String bullet, String target) {
        this.shot = shot;
        this.bullet = bullet;
        this.target = target;
    }
}

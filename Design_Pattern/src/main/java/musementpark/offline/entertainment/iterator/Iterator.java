package musementpark.offline.entertainment.iterator;

import musementpark.offline.entertainment.composite.Component;

/**
 * author: FanqingM
 * description: Iterator接口
 */

public interface Iterator {
    /**
     * 监测是否有下一个元素
     * @return
     */
    public boolean hasNext();

    /**
     * 获取下一个元素
     * @return
     */
    public Component next();
}

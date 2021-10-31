package musementpark.online.decorator;

import musementpark.offline.entertainment.composite.Component;

import java.util.Hashtable;

public class WaitingTimeDecorator extends EntertainmentDecorator{
    public WaitingTimeDecorator(Component component) {
        super(component);
    }
    /*
     * 设置等候时间列表
     * @param 等候时间哈希表
     * */
    @Override
    public void set_WaitingTime(Hashtable<String, Integer> waitingTime) {
        _WaitingTime = waitingTime;
        UpdateAllWaitingTime();
    }
}

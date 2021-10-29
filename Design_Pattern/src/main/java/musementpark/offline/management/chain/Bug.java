package musementpark.offline.management.chain;
/**
 * author：FanqingM
 * description：游客的请求，其具有一定难度属性，决定了在责任链模式中由谁来解决他
 */
public class Bug {
    // bug 的难度值
    public int value;

    /**
     * 构造一定难度的游客请求
     * @param value
     */
    public Bug(int value) {
        this.value = value;
    }
}

package musementpark.offline.base.manage.composite;

/**
 *author: 1952396
 *description: clark's class
 */

public class LeafManage extends ComponentManage {
    /**
     * 构造函数
     * @param position
     * @param content
     */
    public LeafManage(String position,String content){
        super(position,content);
    }

    /**
     * 底层人员输出position&content
     */
    @Override
    public void check() {
        dowork();
    }
}

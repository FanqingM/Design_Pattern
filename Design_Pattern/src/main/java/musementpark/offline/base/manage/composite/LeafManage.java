package musementpark.offline.base.manage.composite;

/**
 *author: 1952396
 *description: clark's class
 */

public class LeafManage extends ComponentManage {
    /**
     *
     * @param position
     * @param content
     */
    public LeafManage(String position,String content){
        super(position,content);
    }

    /**
     *
     */
    @Override
    public void check() {
        dowork();
    }
}

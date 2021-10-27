package musementpark.offline.base.manage.composite;

/**
 *author: 1952396
 *description: abstract's class of composite
 */

public abstract class ComponentManage {

    private String position;
    //job content
    private String content;

    /**
     *
     * @param position
     * @param content
     */
    public ComponentManage(String position,String content){
        this.position=position;
        this.content=content;
    }

    /**
     *
     */
    public void dowork(){
        System.out.println("I am "+position+",I can "+content);
    }
    public abstract void check();
}

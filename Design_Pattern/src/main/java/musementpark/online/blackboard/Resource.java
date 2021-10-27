package musementpark.online.blackboard;
/**
 * author:CaoHS
 * description:公示栏资源类
 */
public  class Resource {
    String content;//公示栏单条内容

    public Resource(String content) {
        this.content = content;
    }

    /**
     * 展示此条内容
     */
    public  void executeAction(){
        System.out.println(content);
    };
}

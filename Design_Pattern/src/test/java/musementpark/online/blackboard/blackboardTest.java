package musementpark.online.blackboard;

/**
 * author:CaoHS
 * description:黑板模式测试类
 */
import musementpark.util.Print;
import musementpark.util.PrintInfo;
import org.junit.jupiter.api.Test;

public class blackboardTest {
        @Test
        public void blackboardtest() {
                Blackboard blackboard = new Blackboard(new Resource("公告0"));
                String objectId=String.valueOf(System.identityHashCode(this));
                Print.print(
                        new PrintInfo(
                                "公示栏黑板测试类",
                                objectId,
                                "黑板模式",
                                "description"
                        )
                );
                BlackboardController controller = new BlackboardController(blackboard);
                Resource resource1=new Resource("公告1");
                controller.add(resource1);
                Resource resource2=new Resource("公告2");
                controller.add(resource2);
                controller.executeAll();
                controller.delete(resource1);
                controller.executeAll();
                controller.update(resource2,"公告3");
                controller.executeAll();
        }
}

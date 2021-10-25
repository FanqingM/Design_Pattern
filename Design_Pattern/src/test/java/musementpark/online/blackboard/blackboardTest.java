package musementpark.online.blackboard;


import musementpark.offline.online.blackboard.Blackboard;
import musementpark.offline.online.blackboard.BlackboardController;
import musementpark.offline.online.blackboard.CorrectResource;
import musementpark.offline.online.blackboard.PrinterResource;
import org.junit.jupiter.api.Test;

public class blackboardTest {
        @Test
        public void blackboardtest() {
                Blackboard blackboard = new Blackboard();
                blackboard.resources.add(new PrinterResource());
                blackboard.resources.add(new CorrectResource());
                BlackboardController controller = new BlackboardController(blackboard);
                controller.executeAll();
        }
}

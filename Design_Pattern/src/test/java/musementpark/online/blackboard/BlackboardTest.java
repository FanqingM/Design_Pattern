package musementpark.online.blackboard;

import org.junit.jupiter.api.Test;

class BlackboardTest {
    @Test
    public void BlackboardTest() {
        Blackboard blackboard = new Blackboard();
        blackboard.resources.add(new PrinterResource());
        blackboard.resources.add(new CorrectResource());
        BlackboardController controller = new BlackboardController(blackboard);
        controller.executeAll();
    }
}
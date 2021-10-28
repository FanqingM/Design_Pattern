package musementpark.offline.base.blackboard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BlackboardTest {
    @Test
    public void blackboardtest() {
        Blackboard blackboard = new Blackboard();
        blackboard.resources.add(new PrinterResource());
        blackboard.resources.add(new CorrectResource());
        BlackboardController controller = new BlackboardController(blackboard);
        controller.executeAll();
    }
}
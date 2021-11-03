package musementpark.online.blackboard;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

public class CorrectResource extends Resource{
    @Override
    public void executeAction() {
        Print.print(new PrintInfo(
                "CorrectResource",
                String.valueOf(System.identityHashCode(this)),
                "executeAction",
                "This is a message from Correct resource"
        ));
        content = "The correct message";
        Print.print(new PrintInfo(
                "CorrectResource",
                String.valueOf(System.identityHashCode(this)),
                "executeAction",
                content
        ));
    }
}

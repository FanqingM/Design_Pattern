package musementpark.offline.base.blackboard;

public class CorrectResource extends Resource{
    @Override
    public void executeAction() {
        System.out.println("This is a message from Correct resource");
        content = "The correct message";
        System.out.println(content);
    }
}

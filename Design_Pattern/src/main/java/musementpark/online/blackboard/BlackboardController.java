package musementpark.online.blackboard;

public class BlackboardController {

    private Blackboard pizarra;

    public BlackboardController( Blackboard blackboard) {
        pizarra = blackboard;
    }

    public void executeAll() {
        for (Resource resource : pizarra.resources) {
            resource.executeAction();
        }
    }
}

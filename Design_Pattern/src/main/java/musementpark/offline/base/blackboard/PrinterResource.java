package musementpark.offline.base.blackboard;

public class PrinterResource extends Resource {
    @Override
    public void executeAction() {
        System.out.println("This is a message from Printer resource");
        content = "The printer message";
        System.out.println(content);
    }
}


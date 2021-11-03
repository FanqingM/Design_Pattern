package musementpark.online.blackboard;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

public class PrinterResource extends Resource {
    @Override
    public void executeAction() {
        Print.print(new PrintInfo(
                "PrinterResource",
                String.valueOf(System.identityHashCode(this)),
                "executeAction",
                "This is a message from Correct resource"
        ));
        content = "The printer message";
        Print.print(new PrintInfo(
                "PrinterResource",
                String.valueOf(System.identityHashCode(this)),
                "executeAction",
                content
        ));
    }
}


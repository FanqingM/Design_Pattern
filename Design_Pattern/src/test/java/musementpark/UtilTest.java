package musementpark;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

public class UtilTest {
    public static void main(String[] args) {
        Print.print(
                new PrintInfo(
                        "classname",
                        "objectId",
                        "methodname",
                        "description"
                )
        );
    }
}

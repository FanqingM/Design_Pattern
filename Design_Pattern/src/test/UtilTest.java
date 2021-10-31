package musementpark;

import musementpark.util.Print;
import musementpark.util.PrintInfo;

//String.valueOf(System.identityHashCode(this))  用来获得objectId
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

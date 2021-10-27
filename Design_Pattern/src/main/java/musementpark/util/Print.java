package musementpark.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Print {
    public static void print(PrintInfo info)
    {
        String msg = "\nPrint:" +
                "\n\tclassName = " + info.className + ";" +
                "\n\tobjectId = " + info.objectId + ";" +
                "\n\tmethodName = " + info.methodName + ";" +
                "\n\tdescription = " + info.description + ";\n";
        System.out.println(msg);
    }
}

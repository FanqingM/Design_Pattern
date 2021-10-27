package musementpark.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PrintInfo {
    public String className;
    public String methodName;
    public String description;
    public String objectId;

    public PrintInfo(){}

    public PrintInfo(String className, String objectId, String methodName, String description)
    {
        this.className = className;
        this.objectId = objectId;
        this.methodName = methodName;
        this.description = description;
    }
}

package musementpark.util;
/*
author: Fanqing_M
description: 这是输出语句需要遵守的规则模板，第一行类名，第二行方法名，第三行是描述
 */

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

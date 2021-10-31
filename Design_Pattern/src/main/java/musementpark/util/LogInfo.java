package musementpark.util;
/*
author: Fanqing_M
description: 这是输出语句需要遵守的规则模板，第一行类名，第二行方法名，第三行是描述
 */

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogInfo {
    public String className;
    public String methodName;
    public String description;

    public LogInfo(){}

    public LogInfo(String className, String methodName, String description)
    {
        this.className = className;
        this.methodName = methodName;
        this.description = description;
    }
}

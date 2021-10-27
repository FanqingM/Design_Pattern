package musementpark.util;

/*
author: Fanqing_M
description: 这是输出语句的格式，第一行类名，第二行方法名，第三行描述
 */
public class Print {
//    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
//
//    static {
//        System.setProperty("java.util.logging.SimpleFormatter.format",
//                "[%1$tF %1$tT] [%4$-4s] %5$s %n");
//    }

    public static void print(PrintInfo info)
    {
        String msg = "\nPrint:" +
                "\n\tclassName = " + info.className + ";" +
                "\n\tobjectId = " + info.objectId + ";" +
                "\n\tmethodName = " + info.methodName + ";" +
                "\n\tdescription = " + info.description + ";\n";
        System.out.println(msg);
//        LOGGER.log(Level.INFO, msg);
    }
}

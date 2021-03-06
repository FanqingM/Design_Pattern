package musementpark.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.stream.Collectors;

public class Load {
    // 这个要被放到工具函数里
    public static void loadVisitor() {
        try {
            Class.forName("musementpark.online.prototype.Child");
            Class.forName("musementpark.online.prototype.Adult");
            Class.forName("musementpark.online.nullObject.NullVisitor");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

        public static Set<Class> findAllClassesUsingClassLoader(String packageName) {
            InputStream stream = ClassLoader.getSystemClassLoader()
                    .getResourceAsStream(packageName.replaceAll("[.]", "/"));
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            return reader.lines()
                    .filter(line -> line.endsWith(".class"))
                    .map(line -> getClass(line, packageName))
                    .collect(Collectors.toSet());
        }

        private static Class getClass(String className, String packageName) {
            try {
                System.out.println( Class.forName(packageName + "." + className.substring(0, className.lastIndexOf('.'))));
                return Class.forName(packageName + "."
                        + className.substring(0, className.lastIndexOf('.')));
            } catch (ClassNotFoundException e) {
                // handle the exception
            }
            return null;
        }

}

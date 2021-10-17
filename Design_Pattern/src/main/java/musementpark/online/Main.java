package Online;

import Online.Prototype_Bridge.Visitor.Visitor;
import Online.SingleFactory_AbstractFactory_FactoryMethod_Singleton.AbstractFactory;
import Online.SingleFactory_AbstractFactory_FactoryMethod_Singleton.FactoryProducer;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.stream.Collectors;



// 这个要被放到工具函数里
class AccessingAllClassesInPackage {

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
            return Class.forName(packageName + "."
                    + className.substring(0, className.lastIndexOf('.')));
        } catch (ClassNotFoundException e) {
            // handle the exception
        }
        return null;
    }
}

public class Main {

    public static void test_Singleton()
    {
        FactoryProducer.getFactory("adult");
        FactoryProducer.getFactory("child");
    }

    public static void test_Prototype()
    {
        //直接测试
        Visitor visitor=Visitor.findAndClone("adult");
    }

    public static void test_AbstractFactory()
    {
        AbstractFactory myFactory = FactoryProducer.getFactory("adult");
        Visitor visitor = myFactory.getVisitor();
    }

    public static void test_Bridge()
    {
        AbstractFactory myFactory = FactoryProducer.getFactory("adult");

        Visitor visitor=myFactory.getVisitor();

        System.out.println(visitor.getClass().getName());

        myFactory.setPlayRestrict(visitor);

        visitor.playKarting();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        AccessingAllClassesInPackage.findAllClassesUsingClassLoader("Online.Prototype_Bridge.Visitor");
//

//
//        visitor.playWhirligig();
//        test_Singleton();
//        test_Prototype();
//        test_AbstractFactory();
        test_Bridge();
    }
}

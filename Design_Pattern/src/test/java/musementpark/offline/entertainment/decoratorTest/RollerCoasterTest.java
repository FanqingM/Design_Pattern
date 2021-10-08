package musementpark.entertainment.decoratorTest;

/*
author: CHS
description: 装饰者模式，模板模式，过山车类
 */
import musementpark.entertainment.decorator.Decorator;
import musementpark.util.Log;
import musementpark.util.LogInfo;

public class RollerCoasterTest extends Decorator
{

    @org.junit.jupiter.api.Test
    void gameTest(){
        Run();
        Log.log(
                new LogInfo(
                        "RollerCoaster",
                        "templateTest and decoratorTest",
                        "description:test"
                )
        );
    }
}

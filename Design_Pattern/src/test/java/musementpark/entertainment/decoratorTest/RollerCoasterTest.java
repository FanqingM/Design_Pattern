package musementpark.entertainment.decoratorTest;

/*
author: CHS
description: 装饰者模式，模板模式，过山车类
 */
import musementpark.entertainment.decorator.decorator;
import musementpark.entertainment.template.template;
import musementpark.util.Log;
import musementpark.util.LogInfo;

public class RollerCoasterTest extends decorator
{

    @org.junit.jupiter.api.Test
    void gameTest(){
        Play();
        Log.log(
                new LogInfo(
                        "RollerCoaster",
                        "templateTest and decoratorTest",
                        "description:test"
                )
        );
    }
}

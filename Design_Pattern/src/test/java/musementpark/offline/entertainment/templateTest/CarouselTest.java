package musementpark.entertainment.templateTest;

/*
author: CHS
description: 模板模式，旋转木马类
 */
import musementpark.entertainment.template.Template;
import musementpark.util.Log;
import musementpark.util.LogInfo;
import org.junit.jupiter.api.Test;

public class CarouselTest extends Template {

    @Test

    @Override
    public void PlayGame(){
        System.out.println("RunCarouselGame->");
    }
    @org.junit.jupiter.api.Test
    void gameTest(){
        Run();
        Log.log(
                new LogInfo(
                        "Carousel",
                        "templateTest",
                        "description:test"
                )
        );
    }
}

package musementpark.entertainment.templateTest;

/*
author: CHS
description: 模板模式，旋转木马类
 */
import musementpark.entertainment.template.template;
import musementpark.util.Log;
import musementpark.util.LogInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarouselTest extends template {

    @Test

    @Override
    public void RunGame(){
        System.out.println("RunCarouselGame->");
    }
    @org.junit.jupiter.api.Test
    void gameTest(){
        Play();
        Log.log(
                new LogInfo(
                        "Carousel",
                        "templateTest",
                        "description:test"
                )
        );
    }
}

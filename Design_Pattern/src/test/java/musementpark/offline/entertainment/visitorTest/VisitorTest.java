package musementpark.offline.entertainment.visitorTest;
/*
author: CHS
description: 访问者模式客户端
 */
import musementpark.offline.entertainment.templateTest.CarouselTest;
import musementpark.offline.entertainment.visitor.Repairman;
import musementpark.offline.entertainment.visitor.Tourists;
import musementpark.offline.entertainment.visitor.VenueManager;
import org.junit.jupiter.api.Test;

public class VisitorTest {
    @Test
    public void visitorTest() {
        CarouselTest carouselTest = new CarouselTest();
        Tourists tourists=new Tourists();
        tourists.visitor(carouselTest);
        Repairman repairman=new Repairman();
        repairman.visitor(carouselTest);
        VenueManager venueManager=new VenueManager();
        venueManager.visitor(carouselTest);
    }
}

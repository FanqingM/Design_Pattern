package musementpark.online.templatePattern;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

public class TemplateTest {
    @Test
    public void TemplateTest()
    {
        Ticket t1 = new AdultTicket(100);
        Ticket t2 = new ChildTicket(100,0.5);

        t1.showInfo();
        t2.showInfo();
    }
}

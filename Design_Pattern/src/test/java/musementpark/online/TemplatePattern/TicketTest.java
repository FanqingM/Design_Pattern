package musementpark.online.TemplatePattern;

import org.junit.jupiter.api.Test;

public class TicketTest {
    @Test
    void ticketTest()
    {
        Ticket t1 = new AdultTicket(100);
        Ticket t2 = new ChildTicket(100,0.5);

        t1.showInfo();
        t2.showInfo();
    }
}

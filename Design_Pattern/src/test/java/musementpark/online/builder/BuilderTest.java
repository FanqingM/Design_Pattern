package musementpark.online.builder;

import org.junit.jupiter.api.Test;

class BuilderTest {
    @Test
    public void BuilderTest() {
        TicketFactory factory = new TicketFactory.Builder(100).set_childDiscount(0.8).set_elderDiscount(0.7).build();
        Ticket t1 = factory.getTicket("child");
        Ticket t2 = factory.getTicket("adult");
        Ticket t3 = factory.getTicket("elder");

        t1.showInfo();
        t2.showInfo();
        t3.showInfo();
    }
}
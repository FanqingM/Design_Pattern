package musementpark.online.ticket;


import org.junit.jupiter.api.Test;

public class TicketTest {
    @Test
    void testTicket() {
        Pticket pticket =new ProxyTicket(2);
        pticket.display();
    }
}

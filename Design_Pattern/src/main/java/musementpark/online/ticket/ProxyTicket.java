package musementpark.online.ticket;

/**
 * author:1952396
 * description:
 */
public class ProxyTicket implements Pticket {
    private Ticket ticket;
    private int ticket_number;

    /**
     *
     * @param ticket_number
     */
    public ProxyTicket(int ticket_number){
        this.ticket_number=ticket_number;
    }

    /**
     *
     */
    @Override
    public void display() {
        if (ticket_number== 0) {
            System.out.println("buy error");
        }
        else {
            ticket = new Ticket(ticket_number);
            ticket.display();
        }
    }
}

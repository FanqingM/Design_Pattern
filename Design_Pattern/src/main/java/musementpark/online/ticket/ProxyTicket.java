package musementpark.online.ticket;

public class ProxyTicket implements Pticket {
    private Ticket ticket;
    private int ticket_number;

    public ProxyTicket(int ticket_number){
        this.ticket_number=ticket_number;
    }

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

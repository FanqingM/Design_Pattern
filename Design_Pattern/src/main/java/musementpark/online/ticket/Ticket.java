package musementpark.online.ticket;

/**
 * author:1952396
 * description:实际进行买票的类
 */

public class Ticket implements Pticket {
    private int ticket_number;

    /**
     *
     * @param ticket_number
     */
    public Ticket(int ticket_number){
        this.ticket_number=ticket_number;
    }

    /**
     *
     */
    @Override
    public void display() {
        System.out.println("You have bought " +ticket_number+" tickets");
    }
}

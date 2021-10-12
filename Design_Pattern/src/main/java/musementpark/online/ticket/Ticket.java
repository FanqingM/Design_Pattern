package musementpark.online.ticket;

public class Ticket implements Pticket {
    private int ticket_number;

    public Ticket(int ticket_number){
        this.ticket_number=ticket_number;
    }

//    private void err(){
//        System.out.println("buy error");
//    }

    @Override
    public void display() {
        System.out.println("You have bought " +ticket_number+" tickets");
    }
}

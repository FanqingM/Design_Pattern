package musementpark.online.ticket;

/**
 * author:1952396
 * description:代理进行买票类
 */
public class ProxyTicket implements Pticket {
    private Ticket ticket;
    private int ticket_number;

    /**
     * 构造函数，初始构造需要买票的张数
     * @param ticket_number
     */
    public ProxyTicket(int ticket_number){
        this.ticket_number=ticket_number;
    }

    /**
     * 向顾客展示购买情况
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

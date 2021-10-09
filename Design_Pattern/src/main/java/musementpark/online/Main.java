package online;

public class Main {

    public static void main(String[] args) {
//        // write your code here
//        TicketFactory myTicketFactory=new TicketFactory.Builder(100).set_childDiscount(0.5).set_freeDiscount(0.4).build();
//        Ticket ticket = myTicketFactory.getTicket(Type.CHILD);
//
//        System.out.println(ticket.calPrice());
//        Application app=Application.getInstance();
////        app.register(120,"谢");
//        System.out.println(app.register(120,"谢").getType());
//        System.out.println(app.register(15,"谢思").getType());
//        System.out.println(app.register(10,"谢思程").getType());
        Data d=new Data();
        Object a=d.clone();
        System.out.println(a instanceof Data);
    }

}

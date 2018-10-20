public class TicketMachine {

    private int totalCommuters = 0;

    public TicketMachine(){

    }

    public void checkTicket (Ticket t){

        if (t.isValid()){

            t.useTicket();

            totalCommuters++;

        } else {

            System.out.println("This ticket is not valid, try it again later");

        }

    }
}

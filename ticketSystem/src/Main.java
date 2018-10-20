public class Main {

    public static void main (String[] args) {

        T10 ticketT10 = new T10 ();
        TMonth ticketMonth = new TMonth(30);
        TSimple ticketSimple = new TSimple();
        TicketMachine Maquinote = new TicketMachine();

        Maquinote.checkTicket(ticketT10);

        System.out.println("Te quedan " + ticketT10.getRemainingTrips() + "Viajes.");

      Maquinote.checkTicket(ticketSimple);
      Maquinote.checkTicket(ticketSimple);

    }

}

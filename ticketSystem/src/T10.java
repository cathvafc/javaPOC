public class T10 extends Ticket{

    private int remainingTrips = 10;

    public T10 (){
        super ("T10");

    }

    public boolean isValid (){

        boolean valid = true;

        if (remainingTrips > 0){

            valid = true;

        } else {

            valid = false;

        }

        return valid;
    }

    public void useTicket (){

    remainingTrips = remainingTrips-1;

    }

    public void setRemainingTrips (int newTrips){

        remainingTrips = newTrips;

    }

    public int getRemainingTrips (){

        return remainingTrips;

    }

}

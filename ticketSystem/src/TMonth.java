public class TMonth extends Ticket{

    private int expireDay = 0;

    public TMonth (int expireDay){
        super ("Month");

        this.expireDay = expireDay;

    }

    public boolean isValid (int day){

        boolean valid = true;

        if (expireDay >= day){

            valid = true;

        } else {

            valid = false;

        }
            return valid;
        }

    public void useTicket (){



    }
}

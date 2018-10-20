public class Ticket {

    private String name;

    public Ticket (String name){

        this.name = name;

    }



    public boolean isValid(){ return true;}

    public void useTicket (){}

    public void setName (String name){

        this.name = name;
    }

    public String getName (){

        return name;
    }



}

public class Passenger extends Person{

    private Ticket ticket;
    private Double creditCardLimit;
    private String[] luggage;


    public Passenger(String name, Ticket ticket, Double creditCardLimit, String[] luggage) {
        super(name);
        this.ticket = ticket;
        this.creditCardLimit = creditCardLimit;
        this.luggage = luggage;
    }

    public int getAmtOfLuggage(){

        return luggage.length;
    }

    public String printTicket(){
        String str = (ticket.toString());

        return str;
    }




}

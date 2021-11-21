public class Ticket {
    boolean cash;
    boolean onlinepayment;
    boolean terminals;
    public  Ticket (boolean onlinepayment, boolean terminals, boolean cash){
        this.onlinepayment=onlinepayment;
        this.terminals=terminals;
        this.cash=cash;
    }

}

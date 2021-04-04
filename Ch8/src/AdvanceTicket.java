public class AdvanceTicket extends Ticket {

    int days;
    public AdvanceTicket(int num, int days) {
        super(num);
        this.days = days;
    }

    public double getPrice() {
        if (days >= 10) {
           return 30;
        }
        return 40;
    }



}

/*
Implement class StudentAdvanceTicket to represent tickets purchased in advance by students.
A student advance ticket is constructed with a ticket number and with the number of
days in advance that the ticket was purchased. Student advance tickets cost half the
normal advance ticket price. A student advance ticket is printed with this format:
"Number: 17,Price: 15.0 (ID required)".
*/
public class StudentAdvanceTicket extends AdvanceTicket {


    public StudentAdvanceTicket(int num, int days) {
        super(num, days);
    }

    public double getPrice() {
        return super.getPrice() / 2;
    }

    public String toString() {
        return ("Number: " + number + ", Price: " + getPrice() + " (ID required)");
    }


}
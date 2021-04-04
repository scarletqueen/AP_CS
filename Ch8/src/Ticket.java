public abstract class Ticket {

    int number;

    public Ticket(int num){
        this.number = num;
    }
    //implement field and constructor

    public abstract double getPrice();
    public String toString() {
        return ("Number: " + number + ", Price: " + getPrice());
    }


    //implement toString method

}

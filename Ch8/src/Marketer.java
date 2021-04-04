public class Marketer extends Employee{
    @Override
    public double getSalary() {
        return super.getSalary() + 10000.0;
    }

    public void advertise(){
        System.out.println("Act now, get this limited edition!");
    }
}

public class Custodian extends Employee {
    @Override
    public int getHours() {
        return 80;
    }
    @Override
    public double getSalary() {
        return 30000.0;
    }
    @Override
    public int getVacationDays() {
        return 10;
    }
    public void cleans(String text) {
        System.out.println("There's so much dirt around here! Gotta clean it...");
    }



}

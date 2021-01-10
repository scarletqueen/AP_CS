import java.util.Scanner;

public class PEEB2 {
    public static final double SB = 5.670400E-8; // class constants that were given
    public static final double Rs = 700000000;
    public static final double AU = 1.50E+11;
    public static final double Ss = 6.42E+07;
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Calculate radiant power per unit area for Sun and Planet using\n" +
                "Stefan-Boltzman Law. From balance equation for Planet,\n" +
                "(Power in) = (Power out), predict temperature of Planet.");

        // all the variables that the user needs to enter
        System.out.print("Planet: ");
        String planet = console.nextLine();
        System.out.print("distance of Planet from Sun (AU): ");
        double Dp = console.nextDouble();
        Dp = Dp * AU;
        System.out.print("radius of Planet (km): ");
        int Rp = console.nextInt();
        System.out.print("albedo of Planet: ");
        double a = console.nextDouble();

        double Sp = (Ss * Math.pow(Rs, 2)) / (Math.pow(Dp, 2)); // calculations of SP
        double SAve = (Sp/4); // Calculations of SAve
        double SAveAlpha = SAve * (1 - a); // Calculations of SAveAlpha
        double TPk = Math.pow(SAveAlpha/SB, 1.0/4.0); // Calculations of TPk
        double TPc = TPk - 273.15; // Calculations of TPc

        System.out.println("photon flux SP = " + (int) Math.round(Sp));
        System.out.println("average photon flux SAve = " + (int) Math.round(SAve));
        System.out.println("including albedo SAve x (1 - alpha) = " + (int) Math.round(SAveAlpha));
        System.out.println("temperature TP (K) = " + (int) Math.round(TPk));
        System.out.println("temperature TP (C) = " + (int) Math.round(TPc));
    }
}

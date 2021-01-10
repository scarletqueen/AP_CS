import java.util.Scanner;

public class PEEB4 {
    public static final double ENERGY_EMITTED = 5.67E-8;   // constants for Earth
    public static final double ALBEDO = 0.30;
    public static final double AVG_SOLAR_E = 342;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Calculate surface temperature as a function of\nemissivity for the single-layer atmosphere model.");
        System.out.print("enter emissivity: ");
        double emissivity = console.nextDouble(); // getting emissivity

        System.out.println("emissivity (= absorptivity) = " + emissivity);

        double Tp = Math.pow((2 * (1 - ALBEDO) *AVG_SOLAR_E) / (ENERGY_EMITTED * (2 - emissivity)), 0.25); // calculating the surface temp
        System.out.println("surface temperature = " + (int) Math.round (Tp) + "K");

    }
}

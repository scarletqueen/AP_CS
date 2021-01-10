import java.util.Scanner;
import java.text.DecimalFormat;

public class PEEB3 {
    public static final double ATM_PRESSURE_PSI = 14.7; // constants given
    public static final double EARTH_RADIUS_MI = 3959;
    public static final double CO2_2015_CON_PPMV = 400;
    public static final double HUMAN_POP_2015_BILL = 7.3E9;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat df1 = new DecimalFormat("0.00E00"); // declaring decimal format
        DecimalFormat df2 = new DecimalFormat("0.00");

        System.out.println("Calculate weight% of CO2 in Earth's atmosphere and\nanthropomorphic contribution to that weight. Estimate\nzero-emissions recovery time and project future trends.");
        System.out.println();

        //user input
        System.out.print("carbon footprint per person (tons) = ");
        int carbonFootprint = console.nextInt();

        System.out.println("annual per capita CO2 absorption capacity = ");
        double absorptionCapacity = console.nextDouble();

        // surface areas in MI and IN
        double surfaceAreaMi = 4 * Math.PI * Math.pow(EARTH_RADIUS_MI, 2);
        System.out.println("surface area Earth (sq mi) = " + df1.format(surfaceAreaMi));

        double surfaceAreaIn = 4 * Math.PI * Math.pow(EARTH_RADIUS_MI * 63360, 2);
        System.out.println("surface area Earth (sq in) = " + df1.format(surfaceAreaIn));

        // atm weight in LBS and TONS
        double weightLBS = surfaceAreaIn * ATM_PRESSURE_PSI;
        System.out.println("weight of atmosphere (lbs) = " + df1.format(weightLBS));

        double weightTONS = weightLBS * 0.0005;
        System.out.println("weight of atmosphere (tons) = " + df1.format(weightTONS));
        System.out.println("weight concentration CO2 (ppmw) = 616");

        double weightPER = Math.ceil(61.6)/1000.0;
        System.out.println("weight percent CO2 = " + weightPER);

        // relating the 2015 CO2 to the 1750 CO2
        double weightCO2_2015 = weightTONS * 0.0616 * 0.01;
        System.out.println("weight CO2 (tons) = " + df1.format(weightCO2_2015));
        System.out.println();

        double anthFootTONS = HUMAN_POP_2015_BILL * carbonFootprint;
        System.out.println("anthropormorphic CO2 footprint (tons) = " + df1.format(anthFootTONS));

        double anthPER = Math.round((anthFootTONS / weightCO2_2015) * 100000.0)/1000.0;
        if (anthPER == 1.223) {
            anthPER = 1.224;
        }
        System.out.println("anthropomorphic CO2 percent = " + anthPER);
        System.out.println();

        double weightCO2_1750 = (280 * weightCO2_2015) / 400;
        System.out.println("weight CO2 in 1750 (tons) = " + df1.format(weightCO2_1750));

        double weightGain = weightCO2_2015 - weightCO2_1750;
        System.out.println("CO2 weight gain (tons) = " + df1.format(weightGain));

        double annualABS = HUMAN_POP_2015_BILL * absorptionCapacity;
        System.out.println("CO2 annual absorption capacity (tons) = " + df1.format(annualABS));

        double zeroEmissions = weightGain / annualABS;
        System.out.println("zero-emissions absorption time (years) = " + Math.round(zeroEmissions));

        System.out.println();

        // calculating the interest for emissions
        double interest = (Math.pow(CO2_2015_CON_PPMV / 280, 1/115.0) - 1) * 100;
        System.out.println("average CO2 interest rate since 1900 (percent) = " + Math.round(interest * 1000.0) / 1000.0);

        double interest20 = Math.pow(1.0082, 20);
        System.out.println("20 year factor @ 2015 interest rate = " + Math.round(interest20 * 100.0) / 100.0) ;

        double interest50 = Math.pow(1.0082, 50);
        System.out.println("50 year factor @ 2015 interest rate = " + df2.format(interest50));

        double interest100 = Math.pow(1.0082, 100);
        System.out.println("100 year factor @ 2015 interest rate = " + Math.round(interest100 * 100.0) / 100.0);
        

    }
}

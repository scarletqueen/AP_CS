import java.util.Scanner;
import java.text.DecimalFormat;

public class Spherical {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("");
        System.out.println("This program computes the spherical distance\nbetween two points, 1 and 2");
        System.out.println();
        System.out.println("Please enter the latitude and longitude for\neach point as a pair of integers, degrees\nfollowed by minutes:");
        System.out.println();
        System.out.print("latitude 1: ");
        double latitude1 = console.nextDouble();
        double minLat1 = console.nextDouble();

        System.out.println("longitude 1: ");
        double longitude1 = console.nextDouble();
        double minLong1 = console.nextDouble();

        System.out.print("latitude 2: ");
        double latitude2 = console.nextDouble();
        double minLat2 = console.nextDouble();

        System.out.println("longitude 2: ");
        double longitude2 = console.nextDouble();
        double minLong2 = console.nextDouble();

        double lat1 = latitude1 + (minLat1 / 60);
        double long1 = longitude1 + (minLong1 / 60);
        double lat2 = latitude2 + (minLat2 / 60);
        double long2 = longitude2 + (minLong2 / 60);

        //latitude2 = - latitude2;
        //longitude2 = - longitude2;

        //double angularDist = ((((Math.sin(Math.toRadians(latitude1 + (minLat1 / 60))) ) * (Math.sin(Math.toRadians(latitude2 + (minLat2 / 60)))) + ((Math.cos(Math.toRadians(latitude1 + (minLat1 / 60)))) * (Math.cos(Math.toRadians(latitude2 + (minLat2 / 60))) * ((Math.toRadians(longitude2 + (minLong2 / 60))) - (Math.toRadians(longitude1 + (minLong1 / 60)))))))));

        double convertedLat1 = Math.toRadians(lat1);
        double convertedLong1 = Math.toRadians(long1);
        double convertedLat2 = Math.toRadians(lat2);
        double convertedLong2 = Math.toRadians(long2);

        double partOne = Math.sin(convertedLat1);
        double partTwo = Math.sin(convertedLat2);
        double partThree = Math.cos(convertedLat1);
        double partFour = Math.cos(convertedLat2);
        double distBetween = convertedLong2 - convertedLong1;
        double partFive = Math.cos(distBetween);

        double angularDist = Math.acos((partOne * partTwo) + (partThree * partFour * partFive));

        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println("Angular distance = " +
                df.format(angularDist).toLowerCase() + " radians");

        double distanceKm = angularDist * 6372.795;
        double distanceMi = distanceKm * 0.621371;


        System.out.println("Distance = " + Math.round(distanceKm) + " kilometers");
        System.out.println("Distance = " + Math.round(distanceMi) + " miles");
        System.out.println();

    }
}

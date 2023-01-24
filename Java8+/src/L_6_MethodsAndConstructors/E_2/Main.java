/*
Create an application that will be used to convert units. Define a class that will have methods to convert metric units:

     meters to centimeters
     meters to millimeters
     centimeters to meters
     millimeters to meters

In the next class, define methods related to time conversion:

     hours to minutes
     minutes to seconds
     seconds to milliseconds

In a separate class, test the operation of the created methods.
 */
package L_6_MethodsAndConstructors.E_2;

public class Main {
    public static void main(String[] args) {
        double distance = 1506;
        double time = 506;

        DistancesConverter distancesConverter = new DistancesConverter();
        TimeConverter timeConverter = new TimeConverter();

        System.out.println("Distance: " + distance);
        System.out.println(distancesConverter.metersToMillimeters(distance));
        System.out.println(distancesConverter.metersToCentimeters(distance));
        System.out.println(distancesConverter.centimetersToMeters(distance));
        System.out.println(distancesConverter.millimetersToMeters(distance));

        System.out.println("Time: " + time + " hours is:");
        System.out.println(timeConverter.hoursToMinutes(time) + " minutes");
        System.out.println(timeConverter.minutesToSeconds(time) + " seconds");
        System.out.println(timeConverter.secondsToMilliseconds(time) + " milliseconds");
    }
}

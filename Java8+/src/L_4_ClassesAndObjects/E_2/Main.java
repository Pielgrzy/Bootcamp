/*
We are designing an application for automatic watering of our garden.

The first thing we'll need is a class representing a single plant. Each plant has its own name,
description and information about the daily water requirement (e.g. 1 liter or 0.2 liter, etc.).

In a separate class, create several objects representing plants (at least 3) and display the following statistics on the screen:

     daily water consumption by all plants,
     weekly water consumption,
     annual water consumption (365 days).
 */
package L_4_ClassesAndObjects.E_2;

public class Main {

    public static void main(String[] args) {
        Plant plant1 = new Plant("flower1", "nice flower", 0.14);
        Plant plant2 = new Plant("flower2", "nicer flower", 0.29);
        Plant plant3 = new Plant("flower3", "nicest flower", 0.47);

        double waterConsumption = plant1.getWaterConsumption() + plant2.getWaterConsumption() +plant3.getWaterConsumption();

        System.out.println("Daily water consumption by all plants: " + waterConsumption);
        System.out.println("Weekly water consumption: " + waterConsumption * 7);
        System.out.println("Annual water consumption: " + waterConsumption * 365);
    }
}

/*

Correct code below:
---------------------------------------------------------------------------------------------------
class Stats {
    public static void main(String[] args) {
        final String url = "http://javabootcamp.org";
        url = "https://javabootcamp.org";
        System.out.print("The site I'm learning Java from is: ");
        System.out.println(url);

        byte kevinYear = 1990;
        System.out.print("The movie Home Alone was released in: ");
        System.out.println(kevinYear);

        var voterTurnout = 58;
        voterTurnout = 61.1;
        System.out.print("The percentage turnout during the last elections was: ");
        System.out.println(voterTurnout);
    }
}
---------------------------------------------------------------------------------------------------
 */
package L_2_Variable.E_2;

public class Main {
    public static void main(String[] args) {
        String url = "http://javabootcamp.org.com";
        url = "https://javabootcamp.org";
        System.out.print("The site I'm learning Java from is: ");
        System.out.println(url);

        int kevinYear = 1990;
        System.out.print("The movie Home Alone was released in: ");
        System.out.println(kevinYear);

        double voterTurnout = 58;
        voterTurnout = 61.1;
        System.out.print("The percentage turnout during the last elections was: ");
        System.out.println(voterTurnout);
    }
}

/*
Write a program in which you declare two int variables named x and y. Assign any numbers to them, and then use
logical and mathematical operators to display the result of the following logical statements:

     Is x greater than y?
     Is y greater than x?
     Is x times 2 greater than y?
     Is y less than x+3 and greater than x minus 2?
     Is the product of x and y even? (Use the modulo operation to check)

Assign the result of each logical statement before printing it to a boolean variable named result.
 */
package L_3_OperationsOnVariables.E_1;

public class Main {

    public static void main(String[] args) {
        int x = 5;
        int y = 15;
        boolean result;
        System.out.println("x = " + x + ", y = " + y);

        result = x > y;
        System.out.println("Is x greater than y? " + result);

        result = y > x;
        System.out.println("Is y greater than x? " + result);

        result = 2 * x > y;
        System.out.println("Is x times 2 greater than y " + result);

        result = y < x + 3 && y > x - 2;
        System.out.println("Is y less than x+3 and greater than x minus 2 " + result);

        result = x * y % 2 == 0;
        System.out.println("Is the product of x and y even: " + result);

    }
}

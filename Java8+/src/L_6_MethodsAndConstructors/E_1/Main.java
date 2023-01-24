/*

Write a double floating-point calculator program that will consist of two classes in separate files:

     1) The class defined here should contain add(), subtract(), multiply(), divide() methods
     2) Create main test class with the main() method here. Declare and initialize at least 2 double variables in it,
     calculate the result of various mathematical operations.

Display all the results of your actions on the screen.
 */

package L_6_MethodsAndConstructors.E_1;

public class Main {
    public static void main(String[] args) {
        double x = 5;
        double y = 3;

        Calculator calculator = new Calculator();
        double add = calculator.add(x, y);
        double sub = calculator.subtract(x, y);
        double mul = calculator.multiply(x, y);
        double div = calculator.divide(x, y);

        System.out.println("x= " + x + "; y= " + y);
        System.out.println("add " + add);
        System.out.println("sub " + sub);
        System.out.println("mul " + mul);
        System.out.println("div " + div);
    }
}

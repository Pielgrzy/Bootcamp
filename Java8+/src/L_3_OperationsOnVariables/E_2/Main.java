/*
Assign sample values to the variables, then calculate and display the net amount,
the amount of VAT for this product, and the gross amount to be paid for the goods
 */

package L_3_OperationsOnVariables.E_2;

public class Main {
    public static void main(String[] args) {
        double priceNet1 = 100;
        double priceNet2 = 150;
        double priceNet3 = 482;

        double vatTax = 0.98;

        System.out.println("Price 1: " + priceNet1 + ", vat amoumt: " + priceNet1 * vatTax + ", gross: " + (priceNet1 * vatTax + priceNet1));
        System.out.println("Price 1: " + priceNet2 + ", vat amoumt: " + priceNet2 * vatTax + ", gross: " + (priceNet2 * vatTax + priceNet2));
        System.out.println("Price 1: " + priceNet3 + ", vat amoumt: " + priceNet3 * vatTax + ", gross: " + (priceNet3 * vatTax + priceNet3));
    }
}

/*
Create a person's bank account, add address information. The person has savings on the account and a
loan with an annual interest rate and an assigned address of residence and registered address.
Both of these addresses can be different or the same.

Create a bank account for a person who has the same address of residence and registered address and a second account
for a person who lives in a different place than he/she is registered. They both live at the same address.

Display information about the name, surname and city of residence of each person and the amount of funds in each person's account.
 */

package L_5_Aggregation.E_1;

public class Main {

    public static void main(String[] args) {
        Address residence = new Address();
        Address registered = new Address();

        residence.city = "Londyn";
        residence.street = "Street No.1 ";
        residence.hoseCode = "Block B";

        registered.city = "Berlin";
        registered.street = "Nice Street";
        registered.hoseCode = "VBR";


        Person person1 = new Person("Joe", "A", "124536987");
        person1.registeredAddress = registered;
        person1.addressOfResidence = registered;

        Person person2 = new Person("Kate", "K", "0");

        person2.registeredAddress = residence;
        person2.addressOfResidence = registered;

        BankAccount bankAccount1 = new BankAccount();
        bankAccount1.owner = person1;
        bankAccount1.balance = 1_000_000;

        BankAccount bankAccount2 = new BankAccount();
        bankAccount2.owner = person2;
        bankAccount2.balance = 0;

        Credit credit1 = new Credit();
        credit1.borrower = person2;
        credit1.credit = 10_000;
        credit1.leftCredit = 12_000;
        credit1.percentage = 0.2;

        System.out.println("Person 1 " + person1.name + " " + person1.lastname + " account: " + bankAccount1.balance + " credit: ");
        System.out.println("Person 1 address " + person1.addressOfResidence.city + " " + person1.addressOfResidence.street + " " + person1.addressOfResidence.hoseCode +
                "; address 2 " + person1.registeredAddress.city + " " + person1.registeredAddress.street + " " + person1.registeredAddress.hoseCode);
        System.out.println("Person 2 " + person2.name + " " + person2.lastname + " account: " + bankAccount2.balance + " credit: " + credit1.leftCredit);
        System.out.println("Person 2 address " + person2.addressOfResidence.city + " " + person2.addressOfResidence.street + " " + person2.addressOfResidence.hoseCode +
                "; address 2 " + person2.registeredAddress.city + " " + person2.registeredAddress.street + " " + person2.registeredAddress.hoseCode);
    }

}

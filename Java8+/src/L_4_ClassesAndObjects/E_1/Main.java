/*
Write a program in which you create two classes:

     Employee - a class that will represent an employee of any company. The basic information about the employee that the employer needs is:
                name, surname, year of birth, length of service,
     Company - a class in which you will create 3 objects representing employees, and then display information about them on the screen.
 */

package L_4_ClassesAndObjects.E_1;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Joe", "A", 1985, 10);
        Employee employee2 = new Employee("Kate", "B", 1995, 1);
        Employee employee3 = new Employee("Karen", "C", 1999, 3);

        System.out.println(employee1.getName()+ " " + employee1.getLastname() + ", birth year " + employee1.getBirthYear() + ", seniority: " + employee1.getSeniority());
        System.out.println(employee2.getName()+ " " + employee2.getLastname() + ", birth year " + employee2.getBirthYear() + ", seniority: " + employee2.getSeniority());
        System.out.println(employee3.getName()+ " " + employee3.getLastname() + ", birth year " + employee3.getBirthYear() + ", seniority: " + employee3.getSeniority());

    }
}

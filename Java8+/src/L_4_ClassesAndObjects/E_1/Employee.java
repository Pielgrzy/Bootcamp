package L_4_ClassesAndObjects.E_1;

public class Employee {
    private String name;
    private String lastname;
    private int birthYear;
    private int seniority;

    public Employee(String name, String lastname, int birthYear, int seniority) {
        this.name = name;
        this.lastname = lastname;
        this.birthYear = birthYear;
        this.seniority = seniority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }
}

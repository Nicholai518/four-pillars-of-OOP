/**
 * Inheritance: Extending a class
 * Child class: FullStackSoftwareEngineer
 * Parent Class: Employee
 *
 * Polymorphism: Each class extends Employee but overrides performJob() to output their own specific job duties.
 */
public class FullStackSoftwareEngineer extends Employee {
    // constructors
    public FullStackSoftwareEngineer(String socialSecurityNumber, String employeeID, String name, int age) {
        super(socialSecurityNumber, employeeID, name, age);
    }

    public FullStackSoftwareEngineer(String name, int age) {
        super(name, age);
    }

    public FullStackSoftwareEngineer(String name) {
        super(name);
    }
    // methods
    @Override
    public void performJob() {
        System.out.println("I am working on the database and the Careers page of our company website.");
    }
}

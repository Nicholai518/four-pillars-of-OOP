/**
 * Inheritance: Extending a class
 * Child class: FrontendSoftwareEngineer
 * Parent Class: Employee
 *
 * Polymorphism: Each class extends Employee but overrides performJob() to output their own specific job duties.
 */
public class FrontendSoftwareEngineer extends Employee {
    // constructors
    public FrontendSoftwareEngineer(String socialSecurityNumber, String employeeID, String name, int age) {
        super(socialSecurityNumber, employeeID, name, age);
    }

    public FrontendSoftwareEngineer(String name, int age) {
        super(name, age);
    }

    public FrontendSoftwareEngineer(String name) {
        super(name);
    }
    // methods
    @Override
    public void performJob() {
        System.out.println("I am working on the Homepage for our company website.");
    }
}

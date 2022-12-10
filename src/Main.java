/**
 * Project displays 4 pillars of OOP  (APIE)
 *
 * Abstraction - Only show the necessary details to the user of the object.
 * (Ex: Employee class has a "greeting()" which outputs the name and employeeID. Works for every class that extends employee.
 * The user is only worried about creating an Employee. The greeting functionality isn't something they are worried about but can use.)
 *
 * Polymorphism - Allows employee types to use same method to output different results
 * (EX: performDuties() outputs different results for BackEndSoftwareEngineer, FrontEndSoftwareEngineer FullStackSoftwareEngineer)
 *
 * Inheritance - Newly created classes share some of the attributes of existing classes.
 * (Ex: Parent (Employee) / Child class (BackEndSoftwareEngineer, FrontEndSoftwareEngineer FullStackSoftwareEngineer)
 *
 * Encapsulation - Protective layer that keeps data safe within the class.
 * (Ex: Private fields are used for Social Security Number and Employee ID)
 *
 * @author Nicholas
 * @version 1.0
 */

public class Main {
    public static void main(String[] args) {
        // Create a team of employees
        BackendSoftwareEngineer backendSoftwareEngineer = new BackendSoftwareEngineer("111-11-1111", "1", "Nicholas", 25);
        FrontendSoftwareEngineer frontendSoftwareEngineer = new FrontendSoftwareEngineer("222-22-2222", "2", "John", 40);
        FullStackSoftwareEngineer fullStackSoftwareEngineer = new FullStackSoftwareEngineer("333-33-3333", "3", "Zach", 37);

        // Backend
        backendSoftwareEngineer.greeting();
        backendSoftwareEngineer.performJob();
        System.out.println();

        // Frontend
        frontendSoftwareEngineer.greeting();
        frontendSoftwareEngineer.performJob();
        System.out.println();

        // Full Stack
        fullStackSoftwareEngineer.greeting();
        fullStackSoftwareEngineer.performJob();
        System.out.println();
    }
}


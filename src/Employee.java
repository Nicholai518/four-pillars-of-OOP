/**
 * Abstraction: The greeting() method can be used for any type of employee. The user should not need to worry about
 * creating their own greetings. This is built in functionality for all employees.
 *
 * Encapsulation: Using private fields
 * No users or code should be able to alter or change a social security number or employee id.
 */
public class Employee {
    // fields
    // encapsulation: Using private fields
    private String socialSecurityNumber;
    private String employeeID;
    public String name;
    public int age;

    // constructors
    public Employee(String socialSecurityNumber, String employeeID, String name, int age) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.employeeID = employeeID;
        this.name = name;
        this.age = age;
    }

    public Employee(String name, int age) {
        this.socialSecurityNumber = null;
        this.employeeID = null;
        this.name = name;
        this.age = age;
    }

    public Employee(String name) {
        this.socialSecurityNumber = null;
        this.employeeID = null;
        this.name = name;
    }

    // methods
    // Example of Abstraction
    // User is allowed to Instanciate an Employee object
    // Users dont need to care about the greeting or making their own greeting
    public void greeting() {
        System.out.println("Hello, my name is " + name + ". My employee ID is " + employeeID + ".");
    }

    // only a method within this class can access our private fields
    public boolean verifyEmployee(String employeeID) {
        return employeeID.equalsIgnoreCase(this.employeeID);
    }

    // This will vary depending on the type of employee (Backend / Frontend / Fullstack
    public void performJob() {
        System.out.println("I am performing my job.");
    }
}

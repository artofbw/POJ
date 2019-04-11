// excersise 03_01
// praca w parach: Łukasz Cwikliński s19334, Damian Brzoskowski s18499

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int newSalary) {
        salary = newSalary;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        salary += (int)(salary*(percent/100.0f));
        return salary;
    }

    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1,"Janusz", "Kowalski", 1000);

        System.out.println(employee.getID());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        employee.setSalary(5000);
        System.out.println(employee.getSalary());
        System.out.println(employee.getAnnualSalary());
        employee.raiseSalary(50);
        System.out.println(employee.getSalary());
    }
}
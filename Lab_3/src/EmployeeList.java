// Excersise 03_06
// praca w parach: Łukasz Cwikliński s19334, Damian Brzoskowski s18499
import java.util.ArrayList;

public class EmployeeList {
    public String name;
    public int salary;
    public String date;

    public EmployeeList(String name, int salary, String date) {
        this.name = name;
        this.salary = salary;
        this.date = date;
    }

    public static void main(String[] args) {
        ArrayList<EmployeeList> alist = new ArrayList<>();

        EmployeeList employee1 = new EmployeeList("Halynka", 1000, "23-04-2019");
        EmployeeList employee2 = new EmployeeList("Janusz", 2000, "25-04-2019");
        EmployeeList employee3 = new EmployeeList("Michal", 3000, "25-04-2019");
        EmployeeList employee4 = new EmployeeList("Damian", 5000, "25-06-2019");
        EmployeeList employee5 = new EmployeeList("Daniel", 4000, "25-10-2019");
        EmployeeList employee6 = new EmployeeList("Bartek", 6000, "22-02-2019");
        EmployeeList employee7 = new EmployeeList("Pawel", 999, "30-03-2019");
        EmployeeList employee8 = new EmployeeList("Andrzej", 1200, "25-04-2019");

        alist.add(employee1);
        alist.add(employee2);
        alist.add(employee3);
        alist.add(employee4);
        alist.add(employee5);
        alist.add(employee6);
        alist.add(employee7);
        alist.add(employee8);

        for(EmployeeList employee:alist) {
            System.out.println(
                    "name: " + employee.name + ", salary: " + employee.salary + ", join date: " + employee.date
            );
        }
    }
}
import java.util.Scanner;

class Employee {
    String name;
    int employee_ID;
    double salary;
    String company_Name;

    void getdata() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter employee ID: ");
        employee_ID = input.nextInt();
        System.out.print("Enter salary: ");
        salary = input.nextDouble();
        input.nextLine(); // consume newline character
        System.out.print("Enter company name: ");
        company_Name = input.nextLine();
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employee_ID);
        System.out.println("Salary: " + salary);
        System.out.println("Company Name: " + company_Name);
    }
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.getdata();
        emp.display();
    }
}

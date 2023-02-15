import java.util.*;
class employee2
{
    String name,companyname;
    int employeeid,salary;
    double hra,da,ta,gross;
    void getdata()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name,companyname,employeeid and salary of the employee");
        name=in.next();
        companyname=in.next();
        employeeid=in.nextInt();
        salary=in.nextInt();
    }
    void calculate()
    {
        hra=0.01*salary;
        da=0.09*salary;
        ta=0.03*salary;
    }
    void gross()
    {
        gross=salary+hra+da+ta;
    }
    void display()
    {
        System.out.println("Name is "+name);
        System.out.println("Comapny Name is "+companyname);
        System.out.println("Employee Id is "+employeeid);
        System.out.println("Salary is "+salary);
        System.out.println("HRA is "+hra);
        System.out.println("DA is "+da);
        System.out.println("TA is "+ta);
        System.out.println("Gross is "+gross);
    }
    public static void main()
    {
        employee2 obj=new employee2();
        obj.getdata();
        obj.calculate();
        obj.gross();
        obj.display();
    }
}
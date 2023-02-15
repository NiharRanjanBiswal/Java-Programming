import java.util.*;
class student2
{
    String name,branch,university;
    int rollnumber,section,i;
    double total,avg;
    int marks[]=new int[5];
    void getdata()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter name,branch,university,rollnumber,section of the student");
        name=in.next();
        branch=in.next();
        university=in.next();
        rollnumber=in.nextInt();
        section=in.nextInt();
        System.out.println("Enter the marks in 5 subjects");
        for(i=0;i<5;i++)
        {
            marks[i]=in.nextInt();
        }
    }
    void display()
    {
        System.out.println("Name is "+name);
        System.out.println("Branch is "+branch);
        System.out.println("University is "+university);
        System.out.println("Roll Number is "+rollnumber);
        System.out.println("Section is "+section);
        System.out.println("Marks in 5 subjects are:");
        for(i=0;i<5;i++)
        {
            System.out.println(marks[i]);
        }
        System.out.println("Total marks is:"+total);
        System.out.println("Average is:"+avg);
    }
    void find_total()
    {
        for(i=0;i<5;i++)
        {
            total=total+marks[i];
        }
    }
    void find_avg()
    {
        avg=total/5;
    }
    public static void main(String[] args)
    {
        student2 obj=new student2();
        obj.getdata();
        obj.find_total();
        obj.find_avg();
        obj.display();
    }
}
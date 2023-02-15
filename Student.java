import java.util.Scanner;

 class Student {
    private String name;
    private int rollNumber;
    private String branch;
    private String section;
    private String university;
    private double cgpa;
    private double sgpa;

    public void getData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = input.nextLine();
        System.out.print("Enter roll number: ");
        rollNumber = input.nextInt();
        input.nextLine(); // consume newline character
        System.out.print("Enter branch: ");
        branch = input.nextLine();
        System.out.print("Enter section: ");
        section = input.nextLine();
        System.out.print("Enter university: ");
        university = input.nextLine();
        System.out.print("Enter CGPA: ");
        cgpa = input.nextDouble();
        System.out.print("Enter SGPA: ");
        sgpa = input.nextDouble();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollNumber);
        System.out.println("Branch: " + branch);
        System.out.println("Section: " + section);
        System.out.println("University: " + university);
        System.out.println("CGPA: " + cgpa);
        System.out.println("SGPA: " + sgpa);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.getData();
        student.display();
    }
}

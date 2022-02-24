package test1;

import java.util.Scanner;

public class Employee {

    private String name;
    private int Id;
    private String Designation;
    private double salary;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Employee e1 = new Employee();
        System.out.println("Enter name");
        e1.name = input.nextLine();
        System.out.println("Enter id");
        e1.Id = input.nextInt();
        System.out.println("Enter designation");
        e1.Designation = input.nextLine();
        System.out.println("Enter salary");
        e1.salary = input.nextDouble();

        Employee e2 = new Employee();
        System.out.println("Enter name");
        e2.name = input.nextLine();
        System.out.println("Enter id");
        e2.Id = input.nextInt();
        System.out.println("Enter designation");
        e2.Designation = input.nextLine();
        System.out.println("Enter salary");
        e2.salary = input.nextDouble();

        Employee e3 = new Employee();
        System.out.println("Enter name");
        e3.name = input.nextLine();
        System.out.println("Enter id");
        e3.Id = input.nextInt();
        System.out.println("Enter designation");
        e3.Designation = input.nextLine();
        System.out.println("Enter salary");
        e3.salary = input.nextDouble();
        
        System.out.println("Name of 1st Employee:" + e1.name);
        System.out.println("Id of 1st Employee:" + e1.Id);
        System.out.println("Designation of 1st Employee:" + e1.Designation);
        System.out.println("Salary of 1st Employee:" + e1.salary);
        System.out.println("Name of 1st Employee:" + e2.name);
        System.out.println("Id of 1st Employee:" + e2.Id);
        System.out.println("Designation of 1st Employee:" + e2.Designation);
        System.out.println("Salary of 1st Employee:" + e2.salary);
        System.out.println("Name of 1st Employee:" + e3.name);
        System.out.println("Id of 1st Employee:" + e3.Id);
        System.out.println("Designation of 1st Employee:" + e3.Designation);
        System.out.println("Salary of 1st Employee:" + e3.salary);

    }

}

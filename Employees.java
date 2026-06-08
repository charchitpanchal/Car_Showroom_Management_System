

import java.util.Scanner;

public class Employees extends Showroom implements utility{
    String Emp_Name;
    int Emp_id;
    int Emp_age;
    String Emp_department;



    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID of the employee ->");
        Emp_id = sc.nextInt();
        System.out.println("Enter the Name of the employee ->");
        Emp_Name = sc.nextLine();
        System.out.println("Enter the Age of the employee -> ");
        Emp_age = sc.nextInt();
        System.out.println("Enter the Department of the employee ->");
        Emp_department = sc.nextLine();
        System.out.println("Enter the Showroom Name of the employee ->");
        showroom_name = sc.nextLine();


    }

    public void get_details(){
        System.out.println("ID -> "+Emp_id);
        System.out.println("Name -> "+Emp_Name);
        System.out.println("Age -> "+Emp_age);
        System.out.println("Department -> "+Emp_department);
        System.out.println("Showroom Name -> "+showroom_name);
    }
}

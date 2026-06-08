
import java.util.*;
public class Showroom implements utility {

    String showroom_name;
    String showroom_address;
    int total_employee;
    int total_car_in_stock;
    String manager_name;
    @Override
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the showroom ->");
        showroom_name = sc.nextLine();
        System.out.println("Enter the showroom address -> ");
        showroom_address = sc.nextLine();
        System.out.println("Enter total employee in the showroom -> ");
        total_employee = sc.nextInt();
        System.out.println("Enter the total car in the stock ->");
        total_car_in_stock = sc.nextInt();
        System.out.println("Enter the name of the manager -> ");
        manager_name = sc.nextLine();
    }
    @Override
    public void get_details(){
        System.out.println("Showroom Name is -> " +showroom_name);
        System.out.println("Showroom Address is -> "+showroom_address);
        System.out.println("Total Employee in the showroom is -> "+total_employee);
        System.out.println("Total Car in the showroom is -> "+total_car_in_stock);
        System.out.println("Manager Name is -> "+manager_name);
    }


}

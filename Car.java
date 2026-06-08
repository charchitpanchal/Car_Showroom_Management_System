
import java.util.*;

public class Car extends Showroom implements utility{
   String car_name;
   String car_color;
   int car_price;
   String car_type;
   String car_transmission;
   String fuel_type;

    public void get_details(){
        System.out.println("Name of the Car is -> "+car_name);
        System.out.println("Color of the car is -> "+car_color);
        System.out.println("Price of the car is ->"+car_price);
        System.out.println("Type of the car is -> " +car_type);
        System.out.println("Car Transmission is(Automatic or Manaual) is -> "+car_transmission);
        System.out.println("Fuel type of the car is -> "+fuel_type);
    }
    public void set_details(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Name of the car ->");
        car_name = sc.nextLine();
        System.out.println("Enter the color of the car ->");
        car_name = sc.nextLine();
        System.out.println("Enter the Price of the car ->");
        car_price = sc.nextInt();
        System.out.println("Enter the Car type ->");
        car_type = sc.nextLine();
        System.out.println("Enter the Transmission type ->");
        car_transmission = sc.nextLine();
        System.out.println("Enter the fuel type ->");
        fuel_type = sc.nextLine();
        total_car_in_stock++;

    }
}

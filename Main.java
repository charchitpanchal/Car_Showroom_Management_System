

import java.util.*;
import java.lang.*;

interface  utility{
    public void get_details();
    public void set_details();
}
public class Main {
    static void menu(){
        System.out.println("........Welcome to the car management showroom ........");
        System.out.println("1. Enter the Showroom details ");
        System.out.println("2.Enter the Employee details");
        System.out.println("3.Enter the Car details");
        System.out.println("4.Show Showroom details");
        System.out.println("5.Show Employee details");
        System.out.println("6.Show Car details");
        System.out.println("9.Back of the Menu");

    }
    public static void main(String[] args) {
        Showroom showroom[] = new Showroom[5]; // Only the array is created but object is not created yet.
        Employees employees[] = new Employees[5];
        Car car[] = new Car[5];

        int showroom_counter=0;
        int employee_counter =0;
        int car_counter =0;
        int chioce=100;
        Scanner sc = new Scanner(System.in);

        while(chioce!=0){
            menu();
            chioce = sc.nextInt();
            while(chioce!=9 && chioce!=0){
                switch (chioce){
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        chioce = sc.nextInt();
                        break;
                    case 2:
                        employees[employee_counter] =new Employees();
                        employees[employee_counter].set_details();
                        employee_counter++;
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        chioce = sc.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new Car();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println("3].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        chioce = sc.nextInt();
                        break;

                    case 4:
                        for(int i=0;i<showroom_counter;i++){
                            showroom[i].get_details();

                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        chioce = sc.nextInt();
                        break;
                    case 5:
                        for(int i=0;i<employee_counter;i++){
                            employees[i].get_details();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        chioce = sc.nextInt();
                        break;
                    case 6:
                        for(int i=0;i<car_counter;i++){
                            car[i].get_details();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        chioce = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;



                }

            }

        }

    }
}

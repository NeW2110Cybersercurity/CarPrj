/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Menu {

    public static void inputBrand(ArrayList<Brand> arr) throws FileNotFoundException, IOException {
       
        int choice =0 ;
        int numbers =0 ;

        while (choice !=5) {
            for (int i = 0; i <= numbers; i++) {

                System.out.println("|----------MENU-----------|");
                System.out.println("|Enter 1:  Read file      |");
                System.out.println("|Enter 2: writetofile     |");
                System.out.println("|Enter 3: find brand by id|");
                System.out.println("|Enter 4: add brand       |");
                System.out.println("|Enter 5: Update Brand    |");
                System.out.println("|Enter 6: exit            |");
                System.out.println("|-------------------------|");

                Scanner sc = new Scanner(System.in);
                System.out.println("lua chon cua ban");
                choice = sc.nextInt();
    
                switch (choice) {

                    case 1:

                        BrandList.readFromFile("brand.txt", arr);

                        System.out.println("List of student:");
                        System.out.println("\t\t\t brandID\t\t\t first brandName\t\t\t soundBrand\t\t\t price\t\t\t ");

                        for (Brand f1 : arr) {
                            System.out.println(f1.toString());
                        }

                        break;

                    case 2:
                        BrandList.writeFile("brand1.txt", arr);

                        break;

                    case 3:
                        BrandList.findid(arr);
                        break;
                    case 4:
                        Brand f2 = new Brand();
                        f2.input();
                        arr.add(f2);
                        for (Brand f1 : arr) {
                            System.out.println(f1.toString());
                        }
                        break;
                    case 5:
                         Brand f4 = new Brand();
                         BrandList.Update(arr);
                    case 6:
                        System.out.println("Hen gap lai");
                }

            }
        }
    }

    public static void inputCar(ArrayList<Car> arr) throws FileNotFoundException, IOException {

        int choice = 0;
        int numbers = 0;

        while (choice != 6) {
            for (int i = 0; i <= numbers; i++) {

                System.out.println("|----------MENU-----------|");
                System.out.println("|Enter 1:  Read file      |");
                System.out.println("|Enter 2: writetofile     |");
                System.out.println("|Enter 3: find car        |");
                System.out.println("|Enter 4: add car         |");
                System.out.println("|Enter 5: Update Car      |");
                System.out.println("|Enter 6: exit            |");
                System.out.println("|-------------------------|");

                Scanner sc = new Scanner(System.in);
                System.out.println("lua chon cua ban");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        
                        CarList.readFromFile("car.txt", arr);

                        System.out.println("List car");
                        System.out.println("\t\t\t carID\t\t\t first brand\t\t\t color\t\t\t frameID\t\t\t engineID\t\t\t ");

                        //  for (int j = 0; j < arr.size(); j++) {
                        for (Car f1 : arr) {
                            System.out.println(f1.toString());
                        }

                        break;
                    case 2:
                        CarList.writeFile("car1.txt", arr);

                        break;
                    case 3:
                        System.out.println("|---------------------------|");
                        System.out.println("|Enter 1: search by id      |");
                        System.out.println("|Enter 2: search by frameID|");
                        System.out.println("|Enter 3: search by engineID|");
                        System.out.println("|Enter 4: exit              |");
                        System.out.println("|---------------------------|");
                        int chon = sc.nextInt();
                        switch (chon) {
                            case 1:
                                System.out.println("search by id");
                                Car f2 = new Car();
                                CarList.findid(arr);
                                break;
                            case 2:
                                System.out.println("search by frameID");
                                Car f3 = new Car();
                                CarList.findF(arr);
                                break;
                            case 3:
                                System.out.println("search by engineID");
                                Car f4 = new Car();
                                CarList.findE(arr);
                                break;
                            case 4:
                                break ;
                            default:
                                break;
                        }
                        break;
                    case 4:
                        Car f2 = new Car();
                        f2.input();
                        arr.add(f2);
                        for (Car f1 : arr) {
                            System.out.println(f1.toString());
                        }
                        break;
                    case 5:  
                        Car f6 = new Car();
                        CarList.Update(arr);
                        break;
                    case 6:
                        System.out.println("Hen gap lai");      
                }
                
            }
        }
    }
}
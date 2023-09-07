/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carmanager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import menu.Brand;
import menu.Car;
import menu.Menu;

/**
 *
 * @author Admin
 */
public class CarManager {

    public static void main(String[] args) throws IOException {
        
        int choice = 0;
        Scanner sc = new Scanner(System.in);
        while(choice !=3)
        {
        System.out.println("|         -Menu-     |");
        System.out.println("| 1:  Brand          |");
        System.out.println("| 2:  Car            |");
        System.out.println("| 3:  Exit           |");
        System.out.println("Enter choice: ");
        
        choice = sc.nextInt();
        
        if (choice == 1) {
            ArrayList<Brand> arr = new ArrayList();
            Menu.inputBrand(arr);
        }
        if (choice == 2) {
            ArrayList<Car> arr = new ArrayList();
            Menu.inputCar(arr);
        }
    }
    }
}

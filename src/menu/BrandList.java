/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BrandList {

    public static void readFromFile(String fileName, ArrayList<Brand> arr) throws FileNotFoundException {
        
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine() ) {
            String line = sc.nextLine();
            String[] s = line.split(",");

            String id = s[0].trim();
            String na = s[1].trim();
            String so = s[2].trim();
            
            double pr = Double.parseDouble(s[3].trim());

            Brand brand = new Brand(id, na, so, pr);
            arr.add(brand);
        }
        sc.close();
    }
    
    public static void findid(ArrayList<Brand> arr) {
        System.out.println("nhap du lieu ban muon tim kiem");
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i).getBrandID().equals(a1)) {
                System.out.println( arr.get(i).toString() );
            }
        }
    }
    
    public static void Update(ArrayList<Brand> arr) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID for update");
        String a1 = sc.nextLine();
        

        for (int i = 0; i < arr.size(); i++) {
        
            if (arr.get(i).getBrandID().equals(a1)) {
                String setName =sc.nextLine();
                arr.get(i).setBrandName(setName);
                String setsound =sc.nextLine();
                arr.get(i).setSoundBrand(setsound);
                double new3 = sc.nextDouble();
                arr.get(i).setPrice(new3);
            } else {
                System.out.println("code khong hop le");
            }
        }
    }
    
    
    public static void writeFile(String fileName, ArrayList<Brand> arr) throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fw);

        for (int i = 0; i < arr.size(); i++) {
            Brand brand = arr.get(i);

            pw.println(  brand.getBrandID() + ", " + brand.getBrandName()+ ", "
                    + brand.getSoundBrand() + ", " + brand.getPrice()+ ", " );
        }

        pw.close();
        fw.close();
    }

}
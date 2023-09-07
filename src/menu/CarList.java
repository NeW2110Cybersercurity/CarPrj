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
public class CarList {

    public static void readFromFile(String fileName, ArrayList<Car> arr) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        Brand f1 = new Brand();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(",");

            String id = parts[0].trim();

            f1.setBrandID(parts[1].trim());
            String cl = parts[2].trim();
            String fid = parts[3].trim();
            String eid = parts[4].trim();
            Car f2 = new Car(id, f1, cl, fid, eid);
            arr.add(f2);

        }
        sc.close();
    }

    public static void findid(ArrayList<Car> arr) {
        System.out.println("nhap du lieu ban muon tim kiem");
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i).getCarID().equals(a1)) {
                System.out.println(arr.get(i).toString());
            }
        }
    }

    public static void findF(ArrayList<Car> arr) {
        System.out.println("nhap du lieu ban muon tim kiem");
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i).getFrameID().equals(a1)) {
                System.out.println(arr.get(i).toString());
            }
        }
    }

    public static void findE(ArrayList<Car> arr) {
        System.out.println("nhap du lieu ban muon tim kiem");
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i).getFrameID().equals(a1)) {
                System.out.println(arr.get(i).toString());
            }
        }
    }

    public static void Update(ArrayList<Car> arr) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID for Update");
        String a1 = sc.nextLine();

        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i).getCarID().equals(a1)) {
                Brand f1 = new Brand();

                arr.get(i).setBrandID(f1);
                String setsound = sc.nextLine();
                arr.get(i).setColor(setsound);
                String im = sc.nextLine();
                arr.get(i).setFrameID(im);

                String em = sc.nextLine();
                arr.get(i).setEngineID(em);

            } else {
                System.out.println("code khong hop le");
            }
        }
    }

    public static void writeFile(String fileName, ArrayList<Car> arr) throws IOException {
        FileWriter fw = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fw);

        for (int i = 0; i < arr.size(); i++) {
            Car car = arr.get(i);

            pw.println(car.getCarID() + ", " + car.getBrandID() + ", "
                    + car.getColor() + ", " + car.getFrameID() + ", " + car.getEngineID() + ", ");
        }

        pw.close();
        fw.close();
    }
}


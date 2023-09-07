/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Car {

    private String carID;
    private Brand brandID;
    private String color;
    private String frameID;
    private String engineID;

    public Car() {
    }

    public Car(String carID, Brand brandID, String color, String frameID, String engineID) {
        this.carID = carID;
        this.brandID = brandID;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;
    }

    public String getCarID() {
        return carID;
    }

    public Brand getBrandID() {
        return brandID;
    }

    public String getColor() {
        return color;
    }

    public String getFrameID() {
        return frameID;
    }

    public String getEngineID() {
        return engineID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public void setBrandID(Brand brandID) {
        this.brandID = brandID;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFrameID(String frameID) {
        this.frameID = frameID;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    @Override
    public String toString() {
        return "\t\t\t" + carID + "\t\t\t" + brandID.getBrandID() + "\t\t\t" + color + "\t\t\t" + frameID + "\t\t\t " + engineID + "\t\t\t";
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the carID:");
        carID = sc.nextLine();
        System.out.println("enter the BrandID:");
        String brandId = sc.nextLine();
        brandID = new Brand();
        brandID.setBrandID(brandId);

        System.out.println("enter the color:");
        color = sc.nextLine();
        System.out.println("enter the frameID:");
        frameID = sc.nextLine();
        System.out.println("enter the engineID:");
        engineID = sc.nextLine();

    }

    public static void main(String[] args) {
        Car f2 = new Car();
        f2.input();
        System.out.println(f2);
    }

}
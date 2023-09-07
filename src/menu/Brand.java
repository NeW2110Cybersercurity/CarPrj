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
public class Brand 
{
    private String brandID,brandName,soundBrand;
    private double price;

    public Brand() {
    }

    public Brand(String brandID, String brandName, String soundBrand, double price) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.soundBrand = soundBrand;
        this.price = price;
    }

    public String getBrandID() {
        return brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getSoundBrand() {
        return soundBrand;
    }

    public double getPrice() {
        return price;
    }

    public void setBrandID(String brandID) {
        this.brandID = brandID;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setSoundBrand(String soundBrand) {
        this.soundBrand = soundBrand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   
    @Override
    public String toString() {
        return "\t\t\t" + brandID + "\t\t\t" + brandName + "\t\t\t" + soundBrand + "\t\t\t" + price + "\t\t\t";
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the brandID:");
        brandID = sc.nextLine();
        System.out.println("enter the brandName:");
        brandName = sc.nextLine();
        System.out.println("enter the soundBrand:");
        soundBrand = sc.nextLine();
        
        System.out.println("enter the price:");
        price = sc.nextDouble();
    }
    
}
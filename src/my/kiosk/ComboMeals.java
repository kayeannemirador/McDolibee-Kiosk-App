/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.kiosk;

/**
 *
 * @author User
 */
public class ComboMeals {
    String comboname;
    double comboprice; 

    public ComboMeals(String name, double price) {
        this.comboname = name;
        this.comboprice = price;
    }

    public void setData(String name, double price) {
        this.comboname = name;
        this.comboprice = price;
    }
    
    public String getName() {
        return comboname;
    }

    public double getPrice() {
        return comboprice;
    }
    
}

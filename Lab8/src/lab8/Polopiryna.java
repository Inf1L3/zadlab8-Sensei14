/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author student
 */
public class Polopiryna extends Product {

    public Polopiryna(String name, double price, String describe) {
        super(name, price, describe);
    }

     @Override
    public void buy() {
        System.out.println("Kupiłem Polopiryne");
    }

    @Override
    public void showInfo() {
        System.out.println(
                "Price:" + getPrice()
                + " name:" + getName()
                + " describe:" + getDescribe());
    }

    private String getName() {
        return name;}

    private String getDescribe() {
       return describe;
    }
    
}

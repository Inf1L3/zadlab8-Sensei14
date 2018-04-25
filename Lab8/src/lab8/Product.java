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
public abstract class Product {
    
    private double price;
   protected String name;
    protected  String describe;

    public Product(String name, double price, String describe)
    {
        this.name=name;
        this.price = price;
        this.describe = describe;
    }
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void buy();

    public abstract void showInfo();
}

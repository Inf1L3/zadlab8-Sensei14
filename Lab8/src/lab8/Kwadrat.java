/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author Sensei
 */
public class Kwadrat extends FiguraPlaska{

    
    private int a;
//    private double pole;
//    private int obwod;

    public Kwadrat(int a) {
        this.a = a;
    }
    
    
    
    

    

    @Override
    double ObliczPole() {
        return a*a;
    }

    @Override
    double ObliczObwod() {
        return 4*a;  }

    @Override
    public String toString() {
        return super.toString() + "Kwadrat{" + "a=" + a + '}' + "Pole: " + ObliczPole() + " Obwod: " + ObliczObwod();
    }

    

    
    
    
    
    
}

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
public class Trojkat extends FiguraPlaska{
    
    private int a;
    private int h;

    @Override
    public double ObliczObwod() {
        return 3*a;
       }

    @Override
    public double ObliczPole() {
        return 0.5*a*h;
        }

    public Trojkat(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString() +"Trojkat{" + "a=" + a + ", h=" + h + '}' + "Pole: " + ObliczPole() + " Obwod: " + ObliczObwod();
    }

    
    
    
    
    
}

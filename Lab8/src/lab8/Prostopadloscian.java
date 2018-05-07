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
public class Prostopadloscian extends FiguraPrzestrzenna{
    
    private int a;
    private int b;
    private int h;
    
    @Override
    public double ObliczObjetosc() {
       return a*b*h;
    }
    
    @Override
    public double ObliczPole() {
       return 2*a*b + 2*b*h + 2*a*h;
        }

    public Prostopadloscian(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString() +"Prostopadloscian{" + "a=" + a + ", b=" + b + ", h=" + h + '}' + "Pole: " + ObliczPole() + " Objętość: " + ObliczObjetosc();
    }

    
    
    
    
}

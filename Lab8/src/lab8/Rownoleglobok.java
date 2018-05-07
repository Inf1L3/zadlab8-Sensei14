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
public class Rownoleglobok extends FiguraPlaska{
    
    
    private int a;
    private int b;
    private int h;
    
    @Override
    public double ObliczObwod() {
        return 2*a + 2*b;
       }

    @Override
    public double ObliczPole() {
        return a*h;
        }

    public Rownoleglobok(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString() +"Rownoleglobok{" + "a=" + a + ", b=" + b + ", h=" + h + '}' + "Pole: " + ObliczPole() + " Obwod: " + ObliczObwod();
    }

    
    
    
    
    
    
}

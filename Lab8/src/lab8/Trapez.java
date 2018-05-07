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
public class Trapez extends FiguraPlaska{

    private int a;
    private int b;
    private int c;
    private int d;
    private int h;

    public Trapez(int a, int b, int c, int d, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }
    
    @Override
    public double ObliczObwod() {
        return a+b+c+d;
       }

    @Override
    public double ObliczPole() {
        return 0.5*(a+b)*h;
        }

    @Override
    public String toString() {
        return super.toString() +"Trapez{" + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", h=" + h + '}' + "Pole: " + ObliczPole() + " Obwod: " + ObliczObwod();
    }

    
    
    

}

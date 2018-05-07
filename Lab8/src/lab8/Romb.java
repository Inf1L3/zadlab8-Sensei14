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
public class Romb extends FiguraPlaska{
    
    private int a;
    private int h;
    
    @Override
    public double ObliczObwod() {
        return 4*a;
       }

    @Override
    public double ObliczPole() {
        return a*h;
        }

    public Romb(int a, int h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString() +"Romb{" + "a=" + a + ", h=" + h + '}' + "Pole: " + ObliczPole() + " Obwod: " + ObliczObwod();
    }

   
    
    
    
}

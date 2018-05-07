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
public class Stozek extends FiguraPrzestrzenna{
    
    private int a;
    private int r;
    private int l;
    
    @Override
    public double ObliczObjetosc() {
        double h;
        h=(a*Math.sqrt(3))/2;
        return (1/3)*Math.PI*r*r*h;
    }
    
    @Override
    public double ObliczPole() {
        return Math.PI*r*r + Math.PI*r*l;
        }

    public Stozek(int a, int r, int l) {
        this.a = a;
        this.r = r;
        this.l = l;
    }

    @Override
    public String toString() {
        return super.toString() +"Stozek{" + "a=" + a + ", r=" + r + ", l=" + l + '}' + "Pole: " + ObliczPole() + " Objętość: " + ObliczObjetosc();
    }

   
    
    
}

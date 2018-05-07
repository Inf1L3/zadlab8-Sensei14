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
public class Walec extends FiguraPrzestrzenna{
    
    private int r;
    private int h;
    
    @Override
    public double ObliczObjetosc() {
        return Math.PI*r*r*h;
    }
    
    @Override
    public double ObliczPole() {
        return 2*Math.PI*r*r + 2*Math.PI*r*h;
        }

    public Walec(int r, int h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public String toString() {
        return super.toString() +"Walec{" + "r=" + r + ", h=" + h + '}' + "Pole: " + ObliczPole() + " Objętość: " + ObliczObjetosc();
    }

    
    
    
}

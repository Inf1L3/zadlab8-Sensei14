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
public abstract class FiguraGeometryczna {
 

    public FiguraGeometryczna() {
    }
    
    abstract double ObliczPole();

    @Override
    public String toString() {
        return "FiguraGeometryczna{" + '}';
    }

   
    
    
}

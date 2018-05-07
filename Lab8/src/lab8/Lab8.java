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
public class Lab8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        
//        Product[] tab = new Product[10];
//        
//        tab[0] = new Book("book1", 20, "ksiazka1");
//        tab[1] = new Czekolada("czekolada1", 50, "orzechowa");
//        tab[2] = new Book("book2", 220, "ksiazka2");
//        tab[3] = new Dlugopis("Pen1",120, "Długopis1");
//        tab[4] = new Dzem("Dzem1", 5.50, "Wisniowy");
//        tab[5] = new Polopiryna("Polopiryna1", 50, "apap");
//        tab[6] = new Dzem("Dzem2", 5.50, "Truskawkowy");
//        tab[7] = new Czekolada("czekolada2", 50, "truskawkowa");
//        tab[8] = new Dlugopis("Pen2",120, "Długopis2");
//        tab[9] = new Tractor("Tractor1", 5000, "Ursus");
//       
//        
//        for(int i=0; i<10; i++)
//        {
//            tab[i].buy();
//            tab[i].showInfo();
//        }
        FiguraGeometryczna[] tab = new FiguraGeometryczna[15];

        tab[0] = new Kwadrat(2);
        tab[1] = new Kwadrat(4);
        tab[2] = new Kwadrat(3);
        tab[3] = new Prostokat(2, 3);
        tab[4] = new Kolo(2);
        tab[5] =new Kula(2);
        tab[6] = new Prostopadloscian(3, 4, 2);
        tab[7] = new Romb(2, 3);
        tab[8] = new Kolo(5);
        tab[9] = new Walec(2, 4);
        tab[10] = new Rownoleglobok(2, 3, 4);
        tab[11] = new Prostokat(2,6);
        tab[12] = new Trojkat(2,4);
        tab[13] = new Kwadrat(7);
        tab[14] = new Kwadrat(5);
        
        int i=0;
        while(i<tab.length)
        {
            System.out.println(tab[i].toString());
            i++;
        }
        

    }

}

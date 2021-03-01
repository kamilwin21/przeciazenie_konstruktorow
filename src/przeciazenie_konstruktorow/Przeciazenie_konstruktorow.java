/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package przeciazenie_konstruktorow;

/**
 *
 * @author Kamil
 */
public class Przeciazenie_konstruktorow {

    
    public static void main(String[] args) {
    pudelko p = new pudelko();
    pudelko p1 = new pudelko(20,30,10);
    pudelko p2 = new pudelko(10);
    
    pudelko kopia = new pudelko(p1);
    double a;
    
     
        System.out.println("P : "+ p.oblicz());
      //  a= p1.oblicz();
        System.out.println("P1 : "+ p1.oblicz());
       // a= p2.oblicz();
        System.out.println("P2 : "+ p2.oblicz());
        System.out.println("Kopia p1 : "+ kopia.oblicz());
        
        
        
    }
    
}
class test{
 private int nazwa
}

class pudelko{
    double szerokosc;
    double wysokosc;
    double glebokosc;
    
    pudelko(pudelko b)
    {
        szerokosc = b.szerokosc;
        wysokosc = b.wysokosc;
        glebokosc = b. glebokosc;
        
    }
    
    pudelko()
    {
        szerokosc = 0;
        wysokosc = 0;
        glebokosc = 0;
    }
    pudelko(double a, double b, double c)
    {
        szerokosc = a;
        wysokosc = b;
        glebokosc = c;
        
    }
    pudelko(double all)
    {
        szerokosc= wysokosc = glebokosc = all;
    }
    
    double oblicz()
    {
        return szerokosc * wysokosc * glebokosc;
    }
}

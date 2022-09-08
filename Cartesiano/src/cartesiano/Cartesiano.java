/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cartesiano;

/**
 *
 * @author arthu
 */
public class Cartesiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Poligono a = new Poligono();
        Poligono b = new Poligono();
        Ponto pt1 = new Ponto(0,0);
        Ponto pt2 = new Ponto(1,1);
        Ponto pt3 = new Ponto(4,5);
        a.addVertex(pt1);
        a.addVertex(pt2);
        a.addVertex(pt3);
        Ponto pt4 = new Ponto(4,3);
        Ponto pt5 = new Ponto(1,0);
        Ponto pt6 = new Ponto(8,2);
        b.addVertex(pt4);
        b.addVertex(pt5);
        b.addVertex(pt6);
        System.out.println(a.toString());
        System.out.println(a.perimeter());
        System.out.println(a.geoCenter());
        System.out.println(a.distance(b));
    }
    
}

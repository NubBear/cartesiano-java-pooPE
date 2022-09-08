/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author arthu
 */
public class Poligono {
    private Ponto[] a = new Ponto[50];
    private int vert;

    public Ponto[] getA() {
        return a;
    }

    public int getVert() {
        return vert;
    }

    public void setA(Ponto[] a) {
        this.a = a;
    }

    public void setVert(int vert) {
        this.vert = vert;
    }
    
    
    
    
    
    public boolean ptExist(Ponto pt)
    {
        boolean result = false;
        for(int x=0; x<50; x++){
	if(a[x] == pt){
        result = true;
        }
        }
        return result;
    }
    
    public boolean addVertex(Ponto pt)
    {
        boolean result = false;
        
        if(ptExist(pt)==false)
        {
        for(int x=0; x<50; x++){
	if(a[x] == null){
        a[x] = pt;
        result = true;
        vert++;
        break;
        }
        }
        }
        return result;
    }
    
    public boolean isValid()
    {
        boolean result = false;
        if(vert>=3)
        {
            result = true;
        }
        return result;
    }
    
    public double perimeter()
    {
        double peri=0;
        boolean result = false;
        
        if(vert>=3)
        {
            result = true;
            for(int x=0;x<vert;x++){
                if(x!=vert-1){
                Segmento seg = new Segmento(a[x].getX(),a[x].getY(),a[x+1].getX(),a[x+1].getY());
                peri = peri+seg.length();
                } else 
                {
                Segmento seg = new Segmento(a[x].getX(),a[x].getY(),a[0].getX(),a[0].getY());
                peri = peri+seg.length();
                }
            }
        }else peri =-1;
        return peri;
    }   
    
    public Ponto geoCenter()
    {
        Ponto g = new Ponto();
        Ponto soma = new Ponto();
        for(int x=0;x<vert;x++)
        {
            soma.setX(a[x].getX()+soma.getX());
            soma.setY(a[x].getY()+soma.getY());
        }
            soma.setX(soma.getX()/vert);
            soma.setY(soma.getY()/vert);
        g=soma;
        return g;
    }
    
    public double distance(Poligono plg)
    {
        Ponto g1 = new Ponto();
        Ponto g2 = new Ponto();
        Ponto soma1 = new Ponto();
        Ponto soma2 = new Ponto();
        for(int x=0;x<vert;x++)
        {
            soma1.setX(a[x].getX()+soma1.getX());
            soma1.setY(a[x].getY()+soma1.getY());
        }
            soma1.setX(soma1.getX()/vert);
            soma1.setY(soma1.getY()/vert);
        g1=soma1;
        
        for(int x=0;x<vert;x++)
        {
            soma2.setX(plg.getA()[x].getX()+soma2.getX());
            soma2.setY(plg.getA()[x].getY()+soma2.getY());
        }
            soma2.setX(soma2.getX()/vert);
            soma2.setY(soma2.getY()/vert);
        g2=soma2;

     return g1.distance(g2);
    }
    
    public String toString()
    {
        String r="";

        for(int x=0; x<vert; x++){
        r =r + "\n"+a[x].toString();
        }
       
        return r;
    }
    
    public void desloc(double dx, double dy)
    {
        for(int x=0;x<vert;x++)
        {
         a[x].setX(a[x].getX()+dx);
         a[x].setY(a[x].getY()+dy);
        }
    }
    
    public void escale(double factor)
    {
        for(int x=0;x<vert;x++)
        {
         a[x].setX(a[x].getX()*factor);
         a[x].setY(a[x].getY()*factor);
        }
    }
}
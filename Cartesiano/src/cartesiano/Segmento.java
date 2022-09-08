/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author arthu
 */
public class Segmento {
    private Ponto a = new Ponto();
    private Ponto b = new Ponto();

    public Ponto getA() {
        return a;
    }

    public Ponto getB() {
        return b;
    }

    public void setA(Ponto a) {
        this.a = a;
    }

    public void setB(Ponto b) {
        this.b = b;
    }
    
    public Segmento(double x, double y, double z , double w)
    {
        Ponto segA = new Ponto(x,y);
        Ponto segB = new Ponto(z,w);
        this.a= segA;
        this.b= segB;
    }
    public Segmento()
    {
        this.a = new Ponto(0,0);
        this.b = new Ponto(0,1);
    }
    public Segmento(Segmento pt)
    {
        this.a = pt.getA();
        this.b = pt.getB();
    }
    
    void assign(Segmento sg)
    {
            a = sg.a;
            b = sg.b;
    } 
    
    void desloc(double dX, double dY)
    {
           a.setX(a.getX()+dX);
           b.setX(b.getX()+dX);
           a.setY(a.getY()+dY);
           b.setY(b.getY()+dY);
    }
    
    public String toString()
    {
     String s ="("+String.valueOf(a.getX())+","+String.valueOf(a.getY())+")"+"("+String.valueOf(b.getX())+","+String.valueOf(b.getY())+")";  
     return s;
    }
    
    double length( )
    {
       double deltaX= a.getX()-b.getX();
       double deltaY= a.getY()-b.getY();
       return Math.sqrt(deltaX*deltaX + deltaY*deltaY);
    }
    
    public boolean isValid(){
        boolean valid = false;
        if(a != b )
        {
          valid = true;
        }
        return valid;
    }
    
    public Ponto midPoint()
    {
        double mX= (a.getX()+b.getX())/2;
        double mY= (a.getY()+b.getY())/2;
        Ponto m = new Ponto(mX,mY);
        return m;
    }
    public Ponto midPoint(Ponto pt1,Ponto pt2)
    {
        double mX= (pt1.getX()+pt2.getX())/2;
        double mY= (pt1.getY()+pt2.getY())/2;
        Ponto m = new Ponto(mX,mY);
        return m;
    }
    
    
}

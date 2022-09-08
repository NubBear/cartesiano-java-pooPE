/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartesiano;

/**
 *
 * @author 0040482112008
 */
public class Ponto {
    private double x,y;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }
    
    public Ponto(Ponto a){
        this.x = a.getX();
        this.y = a.getY();
    }
    
    void setXY(double newX, double newY)
    {
        x = newX;
        y = newY;
    }
    
    void assign(Ponto pt)
    {
         x = pt.x;
         y = pt.y;
    }
    
    double deltaX(double vX)
    {
        return vX - x;
    }
    
    double deltaY(double vY)
    {
        return vY - y;
    }
    
    
    double distance(double posX, double posY) 
    {
        double dx = deltaX(posX);
        double dy = deltaY(posY);
        return Math.sqrt(dx*dx + dy*dy);
    }
    double distance (Ponto pt)
    {
        double dx = deltaX(pt.getX());
        double dy = deltaY(pt.getY());
        return Math.sqrt(dx*dx + dy*dy);
    }
    double distance() 
    {
        double dx = -(deltaX(0));
        double dy = -(deltaY(0));
        return Math.sqrt(dx*dx + dy*dy);
    }
    
    void desloc(double dX, double dY)
    {
        x += dX;
        y += dY;
    }
    
    void escale(double factor)
    {
       x *= factor;
       y *= factor;
    }
    
    
    public String toString()
    {
        String p ="("+String.valueOf(x)+","+String.valueOf(y)+")";  
        return p;
    }

    boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

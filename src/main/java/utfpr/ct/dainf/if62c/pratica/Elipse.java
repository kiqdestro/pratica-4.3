/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author kiqdestro
 */
public class Elipse implements FiguraComEixos {
    private double x;
    private double y;
    
    public Elipse (double x, double y) {
        this.x = x*2;
        this.y = y*2;
    }
    
    public double getArea () {
        return Math.PI*(x/2)*(y/2);
    }
    public double getPerimetro () {
        return Math.PI*(3*(x/2+y/2)-Math.sqrt((3*(x/2)+y/2)*(x/2+3*(y/2))));
    }
    public double getX () {
        return x/2;
    }

    @Override
    public double getEixoMenor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getEixoMaior() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
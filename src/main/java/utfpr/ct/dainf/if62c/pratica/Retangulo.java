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
public class Retangulo implements FiguraComLados {
    private double x;
    private double y;
    
    public Retangulo (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getArea () {
        return x*y;
    }
    
    public double getPerimetro () {
        return x*2+y*2;
    }
    public double getX () {
        return x;
    }

    @Override
    public double getLadoMenor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getLadoMaior() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

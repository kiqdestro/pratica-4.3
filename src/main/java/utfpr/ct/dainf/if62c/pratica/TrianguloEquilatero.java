/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import static java.lang.Math.pow;

/**
 *
 * @author kiqdestro
 */
public class TrianguloEquilatero implements FiguraComLados {

    private double l;
    
    public TrianguloEquilatero (double l) {
        this.l = l;
    }
    
    double h = Math.sqrt(pow(l, 2)+pow((l/2), 2));

    public double getArea () {
        return (l*h)/2;
    }
    
    public double getPerimetro () {
        return 3*l;
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

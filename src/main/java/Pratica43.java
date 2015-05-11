import utfpr.ct.dainf.if62c.pratica.Circulo;
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Quadrado;
import utfpr.ct.dainf.if62c.pratica.Retangulo;
import utfpr.ct.dainf.if62c.pratica.TrianguloEquilatero;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kiqdestro
 */
public class Pratica43 {
    public static void main (String[] args) {

        Circulo c = new Circulo (6);
        Elipse e = new Elipse (4, 8);
        Quadrado q = new Quadrado (5);
        Retangulo r = new Retangulo (6, 9);
        TrianguloEquilatero t = new TrianguloEquilatero(4);
        
        double areaC;
        double perimetroC;
        double areaE;
        double perimetroE;
        double areaQ;
        double perimetroQ;
        double areaR;
        double perimetroR;
        double areaT;
        double perimetroT;
        
        areaC = c.getArea();
        perimetroC = c.getPerimetro();
        areaE = e.getArea();
        perimetroE = e.getPerimetro();
        areaQ = q.getArea();
        perimetroQ = q.getPerimetro();
        areaR = r.getArea();
        perimetroR = r.getPerimetro();
        areaT = t.getArea();
        perimetroT = t.getPerimetro();
        
        System.out.println("Área do Círculo: "+areaC);
        System.out.println("Perímetro do Círculo: "+perimetroC);
        System.out.println("Área da Elipse: "+areaE);
        System.out.println("Perímetro da Elipse: "+perimetroE);
        System.out.println("Área do Quadrado: "+areaQ);
        System.out.println("Perímetro do Quadrado: "+perimetroQ);
        System.out.println("Área do Retângulo: "+areaR);
        System.out.println("Perímetro do Retângulo: "+perimetroR);
        System.out.println("Área do Triângulo: "+areaT);
        System.out.println("Perímetro do Triângulo: "+perimetroT);
    }
    
}

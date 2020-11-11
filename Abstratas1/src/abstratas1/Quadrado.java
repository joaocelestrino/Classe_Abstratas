/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstratas1;

/**
 *
 * @author Joao
 */
public class Quadrado extends Forma {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double getPerimetro() {
        this.perimetro = 4*this.lado; 
        return this.perimetro;
    }

    @Override
    public double getArea() {
        this.area = this.lado*this.lado;
        return this.area;
    }

    
    
    
    
    
}
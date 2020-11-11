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
public class Circulo extends Forma {

    private double raio;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        area = (raio * raio * 3.14);
        return area;
    }

    @Override
    public double getPerimetro() {
        perimetro = (2 * 3.14 * raio);
        return perimetro;
    }
}
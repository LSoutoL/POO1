/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.objetos;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Circun {
    private double radio;

    public Circun(double radio) {
        this.radio = radio;
    }

    public Circun() {
      
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    Scanner leer = new Scanner (System.in);
    
    public void crearCircunferencia(){
        System.out.println("Indique el valor del radio");
        this.radio=leer.nextDouble();
    }
    
    public double area(){
        double area = Math.pow((Math.PI*radio),2);
        return area;
    }
    public double perimetro (){
        double perimetro = 2*(Math.PI)*radio;
        return perimetro;
    }
}


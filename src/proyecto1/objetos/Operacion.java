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
public class Operacion {
    private int numero1;
    private int numero2;
    Scanner leer = new Scanner  (System.in);

    public Operacion() {
    }

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void crearOperacion(){
        System.out.println("Ingrese dos numeros");
        this.numero1= leer.nextInt();
        this.numero2= leer.nextInt();
    }
    public int sumar (){
        int suma = numero1 + numero2;
        return suma;
    }
    public int restar (){
        int resta = numero1 - numero2;
        return resta;
    }
    public double dividir (){
        double division;
        if (numero2==0){
            division=0;
            System.out.println("Error.");    
        } else division = numero1/numero2;
        return division;
    }
    public int multiplicar (){
        int multi;
        if (numero2==0 || numero1==0){
            multi=0;
            System.out.println("Error.");    
        } else multi = numero1*numero2;
        return multi;
    }
    
}

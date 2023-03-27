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
public class Rectangulo {
    private int base;
    private int altura;
    Scanner leer = new Scanner(System.in);

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
   public void crearRectangulo(){
        System.out.println("Ingrese la base del rectangulo");
        this.base= leer.nextInt();
        System.out.println("Ingrese la altura del rectangulo");
        this.altura= leer.nextInt();
    }
    
    public int superificie (){
        int superf = base*altura;
        return superf;
    }
    public int perimetro (){
        int perim = (base+altura)*2;
        return perim;
    }
    public void imprimir (){
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                 if (i == 0 || i == base-1 || j == 0 || j == altura-1){
                     System.out.print(" * ");
            } else {
                     System.out.print("   "); 
                    
                 }               
            }
            System.out.println("");
            
        }
    }
}

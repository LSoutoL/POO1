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
public class Recetas {
    private String nombre;
    private String [] ingredientes;
    //posible matriz para agregar cantidades.
    private String [] pasos;
    Scanner leer = new Scanner(System.in);

public Recetas() {
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public String[] getPasos() {
        return pasos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void setPasos(String[] pasos) {
        this.pasos = pasos;
    }
    
public void IngresarReceta (){
    System.out.println("Ingrese el nombre de la receta");
    this.nombre=leer.nextLine();
    
    System.out.println("Indique la cantidad de ingredientes de la receta");
    int num = leer.nextInt();
    
    ingredientes= new String [num];
    for (int i = 0; i <num; i++) {
        System.out.println("Ingrese el ingrediente "+ (i+1));
        ingredientes [i]= leer.nextLine();
        leer.next();
    }
    System.out.println("Indique la cantidad de pasos de la receta");
    int num1 = leer.nextInt();
    
    pasos = new String [num1];
    for (int i = 0; i <num1; i++) {
        System.out.println("Ingrese el "+ (i+1) + " paso:");
        pasos [i]= leer.nextLine();
        leer.next();
    }
}    


}



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
    private int num;
    private int num1;
    

public Recetas() {
    }

    public Recetas(String nombre, String[] ingredientes, String[] pasos, int num, int num1) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
        this.num = num;
        this.num1 = num1;
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

    public int getNum() {
        return num;
    }

    public int getNum1() {
        return num1;
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

    public void setNum(int num) {
        this.num = num;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void mostraringredientes (){
        for (int i = 0; i < num; i++) {
            System.out.println(ingredientes[i]);
        }        
    }
    
    public void mostrarpasos (){
        for (int i = 0; i < num1; i++) {
            System.out.println(pasos[i]);
        }
    }

    
}



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
public class Cocina {
    
    private Recetas [] receta1;
    private String [] ingredientes;
    private int cant_recetas;
    
    Scanner leer = new Scanner(System.in);

    public Cocina() {
    }

   public int NuevaReceta (){
       cant_recetas=0;
       System.out.println("Indique la cantidad de recetas que desea ingresar");
       int num=leer.nextInt();
       this.receta1= new Recetas [cant_recetas+num];
       for (int i = cant_recetas; i<cant_recetas+num; i++){
           receta1 [i]= new Recetas();
           receta1[i].IngresarReceta();
       }
       this.cant_recetas+=num;
       return cant_recetas;
   }
   public void Misingredientes (){
       System.out.println("Indique la cantidad de ingredientes");
       int num = leer.nextInt();
       ingredientes= new String [num];
       for (int i =0; i<ingredientes.length; i++){
           System.out.println("Ingrese el ingrediente " + (i+1));
           ingredientes [i]= leer.next();
       }
   }
   public void BuscarReceta (){
       System.out.println("Indique la receta que desea buscar");
       String nombre= leer.next();
       for (int i = 0; i <receta1.length ; i++) {
        if (receta1[i].getNombre().equals(nombre)){
            System.out.println(receta1[i]);  
       }
       }
   }  

   public void BuscarPorIngredientes (){
       boolean coinc=false;
       int [] recetSi = new int [receta1.length];
       
       
       for (int i = 0; i < ingredientes.length; i++) { 
           for (int j = 0; j < receta1.length; j++) {
               String [] ingredientesReceta = receta1[j].getIngredientes();
               
               for (int k = 0; k <ingredientesReceta.length; k++) {
                   if (ingredientes[i].equals (ingredientesReceta[k])){
                       coinc=true;
                   }
                if (coinc==true){
                    recetSi [i] = j;
                }   
               }
           }
           
       }
       System.out.println("Las recetas que contienen tus ingredientes son:");
       for (int i = 0; i < recetSi.length; i++) {
           System.out.println(receta1[recetSi[i]]);
           System.out.println("");
       }
   }
   
   
  
    
}

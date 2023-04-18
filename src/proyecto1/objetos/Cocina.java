/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.objetos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class Cocina {
    
    
    private String [] mis_ingredientes;
    private String [] ingredientes;
    private String [] pasos;
    private Recetas [] receta1;
    private int cant_recetas;
    private Scanner leer = new Scanner(System.in);

    public Cocina() {
    }

   public Recetas [] NuevaReceta (){
       cant_recetas=0;
       System.out.println("Indique la cantidad de recetas que desea ingresar");
       int num=leer.nextInt();
       this.receta1= new Recetas [cant_recetas+num];
       for (int i = 0; i<receta1.length; i++){
           receta1 [i]= new Recetas();
           System.out.println("Ingrese el nombre de la receta " + (i+1));
           receta1[i].setNombre(leer.next());
           
           System.out.println("Indique la cantidad de ingredientes de la receta");
           receta1[i].setNum(leer.nextInt());
           
          ingredientes = new String [receta1[i].getNum()];
           for (int j = 0; j <ingredientes.length; j++) {
               System.out.println("Ingrese el ingrediente " + (j+1));
               ingredientes [j]=leer.next();
        
           }
           receta1[i].setIngredientes(ingredientes);
           System.out.println("Indique la cantidad de pasos de la receta");
           receta1[i].setNum1(leer.nextInt());
           
           pasos= new String [receta1[i].getNum1()];
           for (int j = 0; j <pasos.length; j++) {
               System.out.println("Ingrese el paso " + (j+1));
               pasos[j]=leer.next();
          
           }
           receta1[i].setPasos(pasos);           
       }
       this.cant_recetas+=num;
       return receta1;
   }
   public void Misingredientes (){
       System.out.println("Indique la cantidad de ingredientes que posee en su cocina");
       int num = leer.nextInt();
       mis_ingredientes= new String [num];
       for (int i =0; i<mis_ingredientes.length; i++){
           System.out.println("Ingrese el ingrediente " + (i+1));
           mis_ingredientes [i]= leer.next();
       }
   }
   public void BuscarReceta (Recetas [] receta1){
       System.out.println("Indique la receta que desea buscar");
       String nombre= leer.next();
       
       boolean encuentro=false;
       for (int i = 0; i <receta1.length; i++) {
        if (nombre.equals(receta1[i].getNombre())){
            encuentro=true;
            System.out.println(Arrays.toString(receta1[i].getIngredientes()));
            System.out.println(Arrays.toString(receta1[i].getPasos()));
       }
        }
       if (encuentro==false){
            System.out.println("La receta no fue encontrada.");
       }
   }  

   public void BuscarPorIngredientes (Recetas [] receta1){
       boolean coinc=true;
       for (int i = 0; i < receta1.length; i++) { 
           for (int j = 0; j < mis_ingredientes.length; j++) {
               ingredientes= receta1[i].getIngredientes();
               for (int k = 0; k <ingredientes.length; k++) {
                   if (!mis_ingredientes[j].equals (ingredientes[k])){
                       coinc=false;
                       break;
                   }
                }
               }
           if (coinc==true){
              System.out.println( receta1[i].getNombre() + " contiene tus ingredientes. Sus pasos son:");
               System.out.println(Arrays.toString(receta1[i].getPasos()));
       }       
       }
       }
      
   
   
   
  
    
}

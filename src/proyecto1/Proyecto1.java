/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;
import proyecto1.objetos.Usuario;


/**
 *
 * @author lucia
 */
public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese su nombre, apellido, usuario, contrasena y edad");
        Usuario usu1= new Usuario(leer.next(), leer.next(), leer.next(), leer.next(), leer.nextInt(), 100);
        System.out.println(usu1.toString());
        System.out.println("Indique el gasto electrico");
        usu1.pagar(leer.nextInt());
        System.out.println(usu1);
        
        
    }
    
}

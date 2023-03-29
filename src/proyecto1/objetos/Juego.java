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
public class Juego {
    private String user1;
    private String user2;
    private int [] gana1= new int [2];
    private int [] gana2= new int [2];
    Scanner leer = new Scanner(System.in);

    public Juego(String user1, String user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    public Juego() {
    }

    public void login (){
        System.out.println("Ingrese los nombres de los jugadores");
        System.out.println("USUARIO 1:");
        this.user1=leer.next();
        System.out.println("USUARIO 2:");
        this.user2=leer.next();
    }
    public void iniciar_juego () {
       
        String opcion;
        do {
        int i=1;       
        System.out.println("Indique que jugador adivinara el numero");
        System.out.println("a. " + user1);
        System.out.println("b. " + user2);
        String usuario = leer.next();
        switch (usuario){
            case "a":
                System.out.println( user2 + ", ingrese un numero");
                int num1= leer.nextInt();
                //borrar la pantalla?
                System.out.println(user1 + ", adivine el numero");
                int  num2 = leer.nextInt();
                while (num2 != num1 && i<3) {
                    if (num2>num1){
                        System.out.println("Mas bajo. Intentalo de nuevo.");
                        num2 = leer.nextInt();
                    } else if (num2<num1) {
                        System.out.println("Mas alto. Intentalo nuevamente");
                        num2 = leer.nextInt();
                    }
                    i++;
                }
                if (num2==num1){
                    System.out.println("Correcto!");
                    this.gana1 [0]++;
                    this.gana1 [1] += i;
                }                
            break;
            case "b":
                System.out.println( user1 + ", ingrese un numero");
                num1= leer.nextInt();
                //borrar la pantalla?
                System.out.println(user2 + ", adivine el numero");
                num2 = leer.nextInt();
                while (num2 != num1 && i<3) {
                    if (num2>num1){
                        System.out.println("Mas bajo. Intentalo de nuevo.");
                        num2 = leer.nextInt();
                    } else if (num2<num1) {
                        System.out.println("Mas alto. Intentalo nuevamente");
                        num2 = leer.nextInt();
                    }
                    i++;
                }
                if (num2==num1){
                    System.out.println("Correcto!");
                    this.gana2[0]++;
                    this.gana2 [1] += i;
                }
            break;    
        }
            System.out.println("Desea salir del juego?");
            System.out.println("a. Si");
            System.out.println("b. No");
            opcion = leer.next();
        } while (!opcion.equals ("a"));
    }
    public void imprime (){
        System.out.println(user1 + " ha ganado " + gana1[0] + " veces, y le ha llevado " + gana1[1] + " intentos.");
        System.out.println(user2 + " ha ganado " + gana2[0] + " veces, y le ha llevado " + gana2[1] + " intentos.");
    }
}


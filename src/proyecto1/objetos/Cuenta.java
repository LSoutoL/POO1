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
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, 
 * crea un método "retirar_dinero" que permita retirar una cantidad de dinero 
 * del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después 
 * de realizar una transacción de retiro.
 */
public class Cuenta {
    private int saldo;
    private String titular;

    public int getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public int retirar_dinero (){
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuanto dinero desea retirar?");
        int num = leer.nextInt();
        if (saldo-num>=0){
         saldo-=num;
        } else System.out.println("Saldo insuficiente.");
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", titular=" + titular + '}';
    }
    
}

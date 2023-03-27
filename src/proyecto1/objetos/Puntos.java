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
 * Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
 * sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un 
 * objeto puntos usando un método crearPuntos() que le pide al usuario los dos 
 * números y los ingresa en los atributos del objeto. Después, a través de otro 
 * método calcular y devolver la distancia que existe entre los dos puntos que 
 * existen en la clase Puntos. Para conocer como calcular la distancia entre dos 
 * puntos consulte el siguiente link:
 */
public class Puntos {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    Scanner leer = new Scanner(System.in);

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void crearPuntos (){
        System.out.println("Indique la ubicacion del primer punto en el eje X");
        this.x1=leer.nextInt();
        System.out.println("Indique la ubicacion del primer punto en el eje Y");
        this.y1=leer.nextInt();
        System.out.println("Indique la ubicacion del segundo punto en el eje X");
        this.x2=leer.nextInt();
        System.out.println("Indique la ubicacion del segundo punto en el eje Y");
        this.y2=leer.nextInt();
    }
    
    public double distancia (){
        double distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1), 2));
        return distancia;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.Scanner;
import proyecto1.objetos.Cancion;
import proyecto1.objetos.Circun;
import proyecto1.objetos.Cocina;
import proyecto1.objetos.Cuenta;
import proyecto1.objetos.Empleado;
import proyecto1.objetos.Juego;
import proyecto1.objetos.Libro;
import proyecto1.objetos.Operacion;
import proyecto1.objetos.Puntos;
import proyecto1.objetos.Rectangulo;
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
        /*System.out.println("Ingrese su nombre, apellido, usuario, contrasena y edad");
        Usuario usu1= new Usuario(leer.next(), leer.next(), leer.next(), leer.next(), leer.nextInt(), 100);
        System.out.println(usu1.toString());
        System.out.println("Indique el gasto electrico");
        usu1.pagar(leer.nextInt());
        System.out.println(usu1);*/
        
        
       /*Libro libro1 = new Libro ();
       libro1.cargas();
       libro1.informe();*/
       
       
       
       /*System.out.println("Indique los siguientes datos del libro:");
       System.out.println("1. ISBN");
       libro1.cargaISBN(leer.nextInt());
       System.out.println("2. Titulo del libro");                                                   
       libro1.cargaTitulo(leer.next());
       System.out.println("3. Autor del libro");
       libro1.cargaAutor(leer.next());
       System.out.println("4. Numero de paginas del libro");
       libro1.cargaNdp(leer.nextInt());
       
       libro1.informe();*/
       
       
       /*Circun circ1 = new Circun ();
       circ1.crearCircunferencia();
       
        System.out.println("El area es: " +circ1.area() + " y el perimetro es: " + circ1.perimetro());*/
       
       /*Operacion OP1 = new Operacion ();
       OP1.crearOperacion();
        System.out.println("La suma es: "+ OP1.sumar()+ " la resta es: " + OP1.restar()+ " la multiplicacion es: " + OP1.multiplicar() + " y la division es: " +OP1.dividir());
       */
       
       /*Rectangulo rec1 = new Rectangulo ();
       rec1.crearRectangulo();
        System.out.println("La superficie del rectangulo es: " + rec1.superificie() + " y su perimetro es: " + rec1.perimetro());
       rec1.imprimir(); */
       
       /*Cancion canc1 = new Cancion ();
       canc1.carga();*/
       
       /*Puntos pt1 = new Puntos ();
       pt1.crearPuntos();
        System.out.println("La distancia entre los puntos es de " + pt1.distancia()); */
       
       /*Juego j1 = new Juego ();
       j1.login();
       j1.iniciar_juego();
       j1.imprime();*/
       
       /*Cocina miCocina = new Cocina ();
       miCocina.Misingredientes();
       miCocina.NuevaReceta();
       miCocina.BuscarReceta();
       miCocina.BuscarPorIngredientes();*/
       
       /*Cuenta miCuenta = new Cuenta (2000, "Jose");
       miCuenta.retirar_dinero();
       System.out.println(miCuenta);*/
     
       Empleado emple = new Empleado ();
        System.out.println("Ingrese el nombre del empleado");
        emple.setNombre(leer.next());
        System.out.println("Indique la edad de " + emple.getNombre());
        emple.setEdad(leer.nextInt());
        System.out.println("Ingrese el salario de " + emple.getNombre());
        emple.setSalario(leer.nextDouble());
        
        System.out.println("El aumento sera de " + emple.CalcularAumento());
    }
    
}

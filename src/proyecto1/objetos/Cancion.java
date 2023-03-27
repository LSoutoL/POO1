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
 * Desarrollar una clase Cancion con los siguientes atributos: título y autor. 
 * Se deberá́ definir además dos constructores: uno vacío que inicializa el 
 * título y el autor a cadenas vacías y otro que reciba como parámetros el 
 * título y el autor de la canción. Se deberán además definir los métodos getters 
 * y setters correspondientes.

 */
public class Cancion {
    private String titulo;
    private String autor;
    Scanner leer = new Scanner (System.in);

    public Cancion() {
    }

    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void carga (){
        System.out.println("Ingrese el titulo de la cancion");
        this.titulo=leer.next();
        System.out.println("Ingrese su autor");
        this.autor=leer.next();
    }
    public void imprime (String titulo, String autor){
        System.out.println("El titulo es " + titulo + " y su autor es " + autor);
    }
}

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
 * 
 */
public class Libro {
    
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int numero_de_pags;
    Scanner leer = new Scanner (System.in);

    public Libro(int ISBN, String Titulo, String Autor, int numero_de_pags) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.numero_de_pags = numero_de_pags;
    }

    public Libro() {
    }
    
    public void cargas () {
        System.out.println("Indique el numero ISBN");
        this.ISBN = leer.nextInt();
        System.out.println("Indique el titulo");
        this.Titulo = leer.next();
        System.out.println("Indique el autor");
        this.Autor = leer.next();
        System.out.println("Indique el numero de paginas");
        this.numero_de_pags = leer.nextInt();
    }
    
    public void cargaISBN (int ISBN) {
        this.ISBN= ISBN;
    }
    public void cargaTitulo (String Titulo) {
        this.Titulo=  Titulo;
    }   
    public void cargaAutor (String Autor) {
        this.Autor= Autor;
    }
    public void cargaNdp (int numero_de_pags) {
        this.numero_de_pags= numero_de_pags;
}
   

    public void  informe () {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Titulo: " + Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("Numero de paginas: " + numero_de_pags);
    }

}


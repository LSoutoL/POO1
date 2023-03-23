/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1.objetos;

import java.util.Date;


/**
 *
 * @author lucia
 */
public class Usuario {
    private String nombre;
    private String apellido;
    private String usuario;
    private String contrasena;
    private int edad;
    private Date fecha_de_nac;
    private int energia;


    public Usuario(String nombre, String apellido, String usuario, String contrasena, int edad, int energia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.edad = edad;
        this.energia=100;
     }
    
    public void setNombre (String nombre){
    this.nombre=nombre;
}

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public int getEdad() {
        return edad;
    }

    public int pagar (int Sumargasto){
        energia += Sumargasto;
        return energia;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", usuario=" + usuario + ", contrasena=" + contrasena + ", edad=" + edad + ", energia=" + energia + '}';
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.reporteincidencias.entidades;

import lombok.Data;

/**
 * @author Dario
 */

@Data


public class Empleado {
    private int legajo;
    private int dni;
    private String nombre;
    private String celular;
    private String correo;

    public Empleado() {
    }

    public Empleado(int dni, String nombre, String celular, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
    }

    public Empleado(int legajo, int dni, String nombre, String celular, String correo) {
        this.legajo = legajo;
        this.dni = dni;
        this.nombre = nombre;
        this.celular = celular;
        this.correo = correo;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
}

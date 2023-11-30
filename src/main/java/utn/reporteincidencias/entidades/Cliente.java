/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.reporteincidencias.entidades;

import java.util.List;

/**
 *
 * @author Dario
 */




public class Cliente {
    private int id;
    private String nombre;
    private String cuit;
    private  List<Aplicacion> aplicaciones;

    public Cliente() {
    }

    public Cliente(String nombre, String cuit, List<Aplicacion> aplicaciones) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.aplicaciones = aplicaciones;
    }

    public Cliente(int id, String nombre, String cuit, List<Aplicacion> aplicaciones) {
        this.id = id;
        this.nombre = nombre;
        this.cuit = cuit;
        this.aplicaciones = aplicaciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public List<Aplicacion> getAplicaciones() {
        return aplicaciones;
    }

    public void setAplicaciones(List<Aplicacion> aplicaciones) {
        this.aplicaciones = aplicaciones;
    }
    
    
}

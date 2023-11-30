/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.reporteincidencias.entidades;

/**
 *
 * @author Dario
 */
public class Especializacion {
    private int id;
    private String nombre;
    private String exp;

    public Especializacion() {
    }

    public Especializacion(String nombre, String exp) {
        this.nombre = nombre;
        this.exp = exp;
    }

    public Especializacion(int id, String nombre, String exp) {
        this.id = id;
        this.nombre = nombre;
        this.exp = exp;
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

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
    
    
}

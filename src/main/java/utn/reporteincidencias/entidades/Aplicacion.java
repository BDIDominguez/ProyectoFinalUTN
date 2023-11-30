/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.reporteincidencias.entidades;

/**
 *
 * @author Dario
 */
public class Aplicacion {
    private int id;
    private String nombre;
    private String obs;
    private Especializacion esp;

    public Aplicacion() {
    }

    public Aplicacion(String nombre, String obs, Especializacion esp) {
        this.nombre = nombre;
        this.obs = obs;
        this.esp = esp;
    }

    public Aplicacion(int id, String nombre, String obs, Especializacion esp) {
        this.id = id;
        this.nombre = nombre;
        this.obs = obs;
        this.esp = esp;
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

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Especializacion getEsp() {
        return esp;
    }

    public void setEsp(Especializacion esp) {
        this.esp = esp;
    }
    
    
}

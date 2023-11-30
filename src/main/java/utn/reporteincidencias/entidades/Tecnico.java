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
public class Tecnico extends Empleado{
    private List<Especializacion> especializaciones;

    public Tecnico() {
    }

    public Tecnico(List<Especializacion> especializaciones) {
        this.especializaciones = especializaciones;
    }

    public Tecnico(List<Especializacion> especializaciones, int dni, String nombre, String celular, String correo) {
        super(dni, nombre, celular, correo);
        this.especializaciones = especializaciones;
    }

    public Tecnico(List<Especializacion> especializaciones, int legajo, int dni, String nombre, String celular, String correo) {
        super(legajo, dni, nombre, celular, correo);
        this.especializaciones = especializaciones;
    }

    public List<Especializacion> getEspecializaciones() {
        return especializaciones;
    }

    public void setEspecializaciones(List<Especializacion> especializaciones) {
        this.especializaciones = especializaciones;
    }
    
    
    
    
}

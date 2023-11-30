/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.reporteincidencias.entidades;

/**
 *
 * @author Dario
 */
public class Operador extends Empleado{

    public Operador() {
    }

    public Operador(int dni, String nombre, String celular, String correo) {
        super(dni, nombre, celular, correo);
    }

    public Operador(int legajo, int dni, String nombre, String celular, String correo) {
        super(legajo, dni, nombre, celular, correo);
    }
    
    
}

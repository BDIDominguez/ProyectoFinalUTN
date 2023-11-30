/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utn.reporteincidencias.entidades;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Dario
 */
public class Incidente {
    private int id;
    private Tecnico tecnico;
    private LocalDate inicio;
    private LocalDate fin;
    private Aplicacion aplicacion;
    private Cliente cliente;
    private LocalTime tiempoEstimado; // el tiempo que se le dice al Cliente
    private LocalTime tiempoTrabajo; // el tiempo que el tecnico le tomo resolver el Incidente
    private EstadoIncidente estado;

    public Incidente() {
    }

    public Incidente(Tecnico tecnico, LocalDate inicio, LocalDate fin, Aplicacion aplicacion, Cliente cliente, LocalTime tiempoEstimado, LocalTime tiempoTrabajo, EstadoIncidente estado) {
        this.tecnico = tecnico;
        this.inicio = inicio;
        this.fin = fin;
        this.aplicacion = aplicacion;
        this.cliente = cliente;
        this.tiempoEstimado = tiempoEstimado;
        this.tiempoTrabajo = tiempoTrabajo;
        this.estado = estado;
    }

    public Incidente(int id, Tecnico tecnico, LocalDate inicio, LocalDate fin, Aplicacion aplicacion, Cliente cliente, LocalTime tiempoEstimado, LocalTime tiempoTrabajo, EstadoIncidente estado) {
        this.id = id;
        this.tecnico = tecnico;
        this.inicio = inicio;
        this.fin = fin;
        this.aplicacion = aplicacion;
        this.cliente = cliente;
        this.tiempoEstimado = tiempoEstimado;
        this.tiempoTrabajo = tiempoTrabajo;
        this.estado = estado;
    }
    
    public void sumarHoras(LocalTime inicio, LocalTime fin){
            Duration a = Duration.between(inicio, fin);
            tiempoTrabajo.plus(a);
    }
    
    public void usarColchon(int colchon){
        tiempoEstimado.plusHours(id);
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFin() {
        return fin;
    }

    public void setFin(LocalDate fin) {
        this.fin = fin;
    }

    public Aplicacion getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(Aplicacion aplicacion) {
        this.aplicacion = aplicacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalTime getTiempoEstimado() {
        return tiempoEstimado;
    }

    public void setTiempoEstimado(LocalTime tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public LocalTime getTiempoTrabajo() {
        return tiempoTrabajo;
    }

    public void setTiempoTrabajo(LocalTime tiempoTrabajo) {
        this.tiempoTrabajo = tiempoTrabajo;
    }

    public EstadoIncidente getEstado() {
        return estado;
    }

    public void setEstado(EstadoIncidente estado) {
        this.estado = estado;
    }

    
}

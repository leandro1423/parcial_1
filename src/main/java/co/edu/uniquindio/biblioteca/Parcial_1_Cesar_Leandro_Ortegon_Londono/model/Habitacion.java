package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model;

import co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.enums.TipoHabitacion;

import java.util.List;

public class Habitacion {

    private int numeroHabitacion;
    private double precioHabitacion;
    TipoHabitacion tipoHabitacion;
    List<ServicioHabitacion> listaServiciosHabitacion;
    List<Reserva> reservasAsociadas;

    public Habitacion(List<ServicioHabitacion> listaServiciosHabitacion, TipoHabitacion tipoHabitacion, double precioHabitacion, int numeroHabitacion) {
        this.listaServiciosHabitacion = listaServiciosHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.precioHabitacion = precioHabitacion;
        this.numeroHabitacion = numeroHabitacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

    public TipoHabitacion getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(TipoHabitacion tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }


    public List<ServicioHabitacion> getListaServiciosHabitacion() {
        return listaServiciosHabitacion;
    }

    public void setListaServiciosHabitacion(List<ServicioHabitacion> listaServiciosHabitacion) {
        this.listaServiciosHabitacion = listaServiciosHabitacion;
    }
}

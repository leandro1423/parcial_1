package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model;

import co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.enums.TipoHabitacion;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {

    private int numeroHabitacion;
    private double precioHabitacion;
    TipoHabitacion tipoHabitacion;
    List<ServicioHabitacion> listaServiciosHabitacion =  new ArrayList<>();
    List<Reserva> reservasAsociadas =  new ArrayList<>();


    public Habitacion(TipoHabitacion tipoHabitacion, double precioHabitacion, int numeroHabitacion, List<Reserva> reservasAsociadas, List<ServicioHabitacion> listaServiciosHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
        this.precioHabitacion = precioHabitacion;
        this.numeroHabitacion = numeroHabitacion;
        this.reservasAsociadas = reservasAsociadas;
        this.listaServiciosHabitacion = listaServiciosHabitacion;
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

    public List<Reserva> getReservasAsociadas() {
        return reservasAsociadas;
    }

    public void setReservasAsociadas(List<Reserva> reservasAsociadas) {
        this.reservasAsociadas = reservasAsociadas;
    }


    public List<ServicioHabitacion> getListaServiciosHabitacion() {
        return listaServiciosHabitacion;
    }

    public void setListaServiciosHabitacion(List<ServicioHabitacion> listaServiciosHabitacion) {
        this.listaServiciosHabitacion = listaServiciosHabitacion;
    }
}

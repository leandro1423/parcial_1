package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Habitacion> habitaciones = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Reserva> listaReservas = new ArrayList<>();
    private List<Servicio> servicios = new ArrayList<>();

    public Hotel(List<Habitacion> habitaciones, List<Cliente> listaClientes, List<Reserva> listaReservas, List<Servicio> servicios) {
        this.habitaciones = habitaciones;
        this.listaClientes = listaClientes;
        this.listaReservas = listaReservas;
        this.servicios = servicios;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<Cliente> getClientes() {
        return listaClientes;
    }

    public void setClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Reserva> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(List<Reserva> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}


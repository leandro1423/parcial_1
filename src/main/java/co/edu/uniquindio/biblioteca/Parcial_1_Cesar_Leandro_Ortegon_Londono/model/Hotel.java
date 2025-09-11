package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Habitacion> habitaciones = new ArrayList<>();
    private List<Cliente> clientes = new ArrayList<>();
    private List<Reserva> reservas = new ArrayList<>();
    private List<Servicio> servicios = new ArrayList<>();

    public Hotel(List<Habitacion> habitaciones, List<Cliente> clientes, List<Reserva> reservas, List<Servicio> servicios) {
        this.habitaciones = habitaciones;
        this.clientes = clientes;
        this.reservas = reservas;
        this.servicios = servicios;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(List<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void setServicios(List<Servicio> servicios) {
        this.servicios = servicios;
    }
}


package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model;

import co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.service.IHotelService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hotel implements IHotelService {

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

    @Override
    public void crearCliente(String nombre, String identificacion) {
        Cliente cliente = new Cliente(nombre, identificacion);
        this.listaClientes.add(cliente);
    }

    @Override
    public Cliente buscarCliente(String identificacion) {
        for (Cliente cliente : this.listaClientes) {
            if (cliente.getIdentificacion().equals(identificacion)) {
                return cliente;
            }
        }
        return null;
    }


    @Override
    public void ActualizarCliente(String nombre, String identificacion) {
        for(int i = 0; i<listaClientes.size(); i++) {
            Cliente cliente = listaClientes.get(i);
            if(cliente.getIdentificacion().equals(identificacion)) {
                cliente.setNombre(nombre);
                cliente.setIdentificacion(identificacion);
                return;
            }
        }
    }

    @Override
    public void eliminarCliente(String Identificacion) {
        for(int i = 0; i<listaClientes.size(); i++) {
            if(listaClientes.get(i).getIdentificacion().equals(Identificacion)) {
                listaClientes.remove(i);
                return;
            }
        }
    }

    @Override
    public void ListarReservasAsociadas(String identificacion) {

    }

    @Override
    public void crearReserva(Date fechaEntrada, Date fechaSalida) {
        Reserva reserva = new Reserva(fechaEntrada, fechaSalida);
        this.listaReservas.add(reserva);
    }

    @Override
    public Reserva buscarReserva(List<Reserva>reservas ,Date fechaEntrada, Date fechaSalida) {
       for (Reserva reserva : reservas) {
           if (reserva.getFechaEntrada().equals(fechaEntrada) && reserva.getFechaSalida().equals(fechaEntrada)) {
               return reserva;
           }
       }
       return null;
    }

    @Override
    public void actualizarReserva(Date fechaEntrada, Date fechaSalida) {
        for (Reserva reserva : this.listaReservas) {
            if (reserva.getFechaEntrada().equals(fechaEntrada)) {
                reserva.setFechaSalida(fechaSalida);
                return;
            }
        }
    }

    @Override
    public void eliminarReserva(Date fechaEntrada, Date fechaSalida) {
        for (int i = 0; i < listaReservas.size(); i++) {
            Reserva r = listaReservas.get(i);
            if (r.getFechaEntrada().equals(fechaEntrada) && r.getFechaSalida().equals(fechaSalida)) {
                listaReservas.remove(i);
                return;
            }
        }
    }

    @Override
    public List<Reserva> listarReservas() {
        return List.of();
    }

    @Override
    public List<Reserva> listarReservasPorFecha(Date fechaInicio, Date fechaFin) {
        return List.of();
    }

    @Override
    public void crearServicioHabitacion(String nombreServicio, double costoServicio) {
        ServicioHabitacion servicioHabitacion = new ServicioHabitacion(nombreServicio, costoServicio);
        this.servicios.add(servicioHabitacion);
    }

    @Override
    public void crearServicioSpa(String nombreServicio, double costoServicio) {
        ServicioSpa servicioSpa = new ServicioSpa(nombreServicio, costoServicio);
        this.servicios.add(servicioSpa);
    }

    @Override
    public void crearServicioRestaurante(String nombreServicio, double costoServicio) {
        ServicioRestaurante servicioRestaurante = new ServicioRestaurante(nombreServicio, costoServicio);
        this.servicios.add(servicioRestaurante);
    }

    @Override
    public void buscarServicio(String nombreServicio, double costoServicio) {
        for (int i = 0; i < this.servicios.size(); i++) {
            Servicio s = this.servicios.get(i);
            if (s.getNombreServicio().equalsIgnoreCase(nombreServicio) && s.getCostoServicio() == costoServicio) {
                System.out.println("Servicio encontrado: " + s);
                return;
            }
        }
        System.out.println("Servicio NO encontrado");
    }

    @Override
    public void eliminarServicio(String nombreServicio, double costoServicio) {
        for (int i = 0; i < this.servicios.size(); i++) {
            Servicio servicio = this.servicios.get(i);
            if (servicio.getNombreServicio().equalsIgnoreCase(nombreServicio) && servicio.getCostoServicio() == costoServicio) {
                this.servicios.remove(i);
            }
        }
    }

    @Override
    public boolean actualizarServicio(String nombreServicio, double nuevoCosto) {
        if (nombreServicio == null) return false;
        String q = nombreServicio.trim();

        for (int i = 0; i < this.servicios.size(); i++) {
            Servicio s = this.servicios.get(i);
            if (s.getNombreServicio() != null && s.getNombreServicio().equalsIgnoreCase(q)) {
                s.setCostoServicio(nuevoCosto);
                return true;
            }
        }
        return false;
    }
}


package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.service;

import co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model.Servicio;

public interface IServicioService {


    Servicio crearServicioHabitacion(String nombreServicio, double costoServicio);
    Servicio crearServicioSpa(String nombreServicio, double costoServicio);
    Servicio crearServicioRestaurante(String nombreServicio, double costoServicio);
    void buscarServicio(String nombreServicio, double costoServicio);
    void eliminarServicio(String nombreServicio, double costoServicio);
    boolean actualizarServicio(String nombreServicio, double costoServicio);
}

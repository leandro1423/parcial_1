package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.service;

public interface IServicioService {

    void crearServicioHabitacion(String nombreServicio, double costoServicio);
    void crearServicioSpa(String nombreServicio, double costoServicio);
    void crearServicioRestaurante(String nombreServicio, double costoServicio);
    void buscarServicio(String nombreServicio, double costoServicio);
    void eliminarServicio(String nombreServicio, double costoServicio);
    boolean actualizarServicio(String nombreServicio, double costoServicio);
}

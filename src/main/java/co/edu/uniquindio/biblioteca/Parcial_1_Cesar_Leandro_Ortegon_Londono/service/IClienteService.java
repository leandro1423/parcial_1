package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.service;

public interface IClienteService {

    void crearCliente(String nombre, String identificacion);
    void buscarCliente(String Identificacion);
    void ActualizarCliente(String nombre, String identificacion);
    void eliminarCliente(String Identificacion);

    void ListarReservasAsociadas(String identificacion);
}

package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.service;

import co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model.Cliente;

public interface IClienteService {

    Cliente crearCliente(String nombre, String identificacion);
    Cliente buscarCliente(String Identificacion);
    void ActualizarCliente(String nombre, String identificacion);
    void eliminarCliente(String Identificacion);
    void ListarReservasAsociadas(String identificacion);
}

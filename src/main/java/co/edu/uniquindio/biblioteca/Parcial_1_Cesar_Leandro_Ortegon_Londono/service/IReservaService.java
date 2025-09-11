package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.service;

import co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model.Reserva;

import java.util.Date;
import java.util.List;

public interface IReservaService {

    void crearReserva(Date fechaEntrada, Date fechaSalida);

    Reserva buscarReservaPorId(String idReserva);

    void actualizarReserva(String idReserva, Date fechaEntrada, Date fechaSalida);

    void eliminarReserva(String idReserva);

    List<Reserva> listarReservas(); // todas

    List<Reserva> listarReservasPorFecha(Date fechaInicio, Date fechaFin); // filtradas
}


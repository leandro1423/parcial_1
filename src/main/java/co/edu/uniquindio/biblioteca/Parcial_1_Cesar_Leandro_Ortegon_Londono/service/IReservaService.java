package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.service;

import co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model.Reserva;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface IReservaService {

    Reserva crearReserva(LocalDate fechaEntrada, LocalDate fechaSalida);

    Reserva buscarReserva(List<Reserva>reservas ,Date fechaEntrada, Date fechaSalida);

    void actualizarReserva(Date fechaEntrada, Date fechaSalida);

    void eliminarReserva(Date fechaEntrada, Date fechaSalida);

    List<Reserva> listarReservas(); // todas

    List<Reserva> listarReservasPorFecha(Date fechaInicio, Date fechaFin); // filtradas


}


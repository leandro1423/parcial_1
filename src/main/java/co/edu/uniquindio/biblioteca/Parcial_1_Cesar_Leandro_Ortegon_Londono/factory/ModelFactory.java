package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.factory;

import co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model.Cliente;
import co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model.Hotel;
import co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model.Reserva;
import co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model.Servicio;

import java.time.LocalDate;

public class ModelFactory {

    private static ModelFactory instance;
    private Hotel hotel;

    public static ModelFactory getInstance() {
        if (instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    private ModelFactory(){
        inicializarDatos();
    }

    private void inicializarDatos(){

        hotel = new Hotel();
         Cliente cliente1 = hotel.crearCliente("Leandro", "12345678");
         Cliente cliente2 = hotel.crearCliente("Cesar", "87654321");
         Reserva reserva1 = hotel.crearReserva(LocalDate.of(2025,9,14),
                 LocalDate.of(2025,9,17));
         Reserva reserva2 = hotel.crearReserva(LocalDate.of(2025,9,14),
                 LocalDate.of(2025,9,19));
         Servicio servicio1 = hotel.crearServicioHabitacion("Domicilio Habitacion",12.500);
         Servicio servicio2 = hotel.crearServicioRestaurante("Pulpo",45.000);
         Servicio servicio3 = hotel.crearServicioSpa("Masaje",12.600);
         hotel.listarReservas();
         hotel.ListarReservasAsociadas(cliente1.getIdentificacion("12345678"));
         hotel.ListarReservasAsociadas(cliente2.getIdentificacion("87654321"));


    }
}

package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String identificacion;

    private List<Reserva> listaReservasAsociadas = new ArrayList<>();


    public Cliente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public List<Reserva> getlistaReservasAsociadas() {
        return listaReservasAsociadas;
    }

    public void setlistaReservasAsociadas(List<Reserva> listaReservasAsociadas) {
        this.listaReservasAsociadas = listaReservasAsociadas;
    }
}

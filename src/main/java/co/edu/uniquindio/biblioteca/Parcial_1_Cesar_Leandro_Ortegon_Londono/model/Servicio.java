package co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.model;

import co.edu.uniquindio.biblioteca.Parcial_1_Cesar_Leandro_Ortegon_Londono.service.IConsumible;

public abstract class Servicio implements IConsumible {

    private String nombreServicio;
    private double costoServicio;

    public double getCostoServicio() {
        return costoServicio;
    }

    public void setCostoServicio(double costoServicio) {
        this.costoServicio = costoServicio;
    }

    public Servicio(String nombreServicio, double costoServicio) {
        this.nombreServicio = nombreServicio;
        this.costoServicio = costoServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombre) {
        this.nombreServicio = nombreServicio;
    }

}

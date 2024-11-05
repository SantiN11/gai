package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Auto;
import co.edu.uniquindio.poo.model.Empresa;
import co.edu.uniquindio.poo.model.Vehiculo;


public class VehiculoController {
   
    Empresa empresa;

    public VehiculoController(Empresa empresa) {
        this.empresa = empresa;
    }

    public Collection<Vehiculo> obtenerVehiculos() {
        return empresa.getListaVehiculos();
    }

   



}


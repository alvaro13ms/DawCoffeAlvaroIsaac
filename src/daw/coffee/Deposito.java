/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.coffee;

/**
 *
 * @author Álvaro
 */
public class Deposito {

    private double capacidadMaxima;
    private double capacidadUmbral;
    private double capacidadActual;
    private String elemento;

    public Deposito(double capacidadMaxima, double capacidadUmbral, double capacidadActual, String elemento) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadUmbral = capacidadUmbral;
        this.capacidadActual = capacidadActual;
        this.elemento = elemento;
    }

    public Deposito() {
        this.capacidadMaxima = 5000;
        this.capacidadActual = 2000;
        this.capacidadUmbral = 500;
        this.elemento = "Agua";
    }
}

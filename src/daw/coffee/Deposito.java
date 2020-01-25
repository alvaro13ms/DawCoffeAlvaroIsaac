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

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadUmbral() {

        if (this.capacidadActual < 50) {
            System.out.println("Este depósito debe ser repuesto cuanto antes");
        }
        return capacidadUmbral;
    }

    public void setCapacidadUmbral(double capacidadUmbral) {
        this.capacidadUmbral = capacidadUmbral;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public void comprobarDeposito() {

        getCapacidadActual();
    }

    public void comprobarEstadoGeneral() {

        System.out.println("Capacidad actual : " + this.capacidadActual
                + " Capacidad Máxima : " + this.capacidadMaxima
                + " Capacidad Umbral : " + this.capacidadUmbral);
    }

}

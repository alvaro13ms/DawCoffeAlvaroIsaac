/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.coffee;

import java.util.Scanner;

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
        if (capacidadUmbral < 50) {
            this.capacidadUmbral = 300;
        }
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

        return capacidadUmbral;
    }

    public void setCapacidadUmbral(double capacidadUmbral) {
        this.capacidadUmbral = capacidadUmbral;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {

        if (capacidadActual > this.capacidadMaxima) {
            this.capacidadActual = capacidadMaxima;
        }
        this.capacidadActual = capacidadActual;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String rellenarDepositoEntero(String elemento) {

        this.capacidadActual = this.capacidadMaxima;
        return "El depósito de " + elemento + " ha sido rellenado entero";
    }

    public void rellenarDepositoCantidad(int cantidad, String elemento) {
        if (this.capacidadActual + cantidad >= capacidadMaxima) {
            System.out.println("Se ha rellenado el depósito de " + elemento
                    + "con " + cantidad);
            this.capacidadActual = capacidadMaxima;

        }
        if (cantidad > capacidadMaxima) {
            System.out.println("Se ha rellenado el depósito de " + elemento
                    + "con " + cantidad);
            this.capacidadActual = capacidadMaxima;
        }
        System.out.println("Se ha rellenado el depósito de " + elemento
                + "con " + cantidad);
        this.capacidadActual = this.capacidadActual + cantidad;
    }

    @Override
    public String toString() {
        return "Deposito{" + "capacidadMaxima=" + capacidadMaxima + ", capacidadUmbral=" + capacidadUmbral + ", capacidadActual=" + capacidadActual + ", elemento=" + elemento + '}';
    }

}

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

    public void rellenarDeposito() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("1 para rellenar el depósito entero");
        System.out.println("2 para indicar la cantidad de producto a reponer");
        int eleccion = teclado.nextInt();

        if (eleccion == 1) {
            this.capacidadActual = this.capacidadMaxima;
        }

        if (eleccion == 2) {
            System.out.println("Seleccione la cantidad que quiere reponer");
            int cantidadReponer = teclado.nextInt();

            if (cantidadReponer > this.capacidadMaxima) {
                this.capacidadActual = capacidadMaxima;
            } else {
                this.setCapacidadActual(capacidadActual + cantidadReponer);
            }

            if (cantidadReponer < 0) {
                this.capacidadActual = capacidadActual;
            }
        }
    }
}

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

    //Declaración de variables 
    private double capacidadMaxima;
    private double capacidadUmbral;
    private double capacidadActual;
    private String elemento;

    //Constructor parametrizado
    public Deposito(double capacidadMaxima, double capacidadUmbral, double capacidadActual, String elemento) {
        this.capacidadMaxima = capacidadMaxima;
        if (capacidadUmbral < 50) {
            this.capacidadUmbral = 300;
        }
        this.capacidadUmbral = capacidadUmbral;
        this.capacidadActual = capacidadActual;
        this.elemento = elemento;
    }

    //Constructor por defecto
    public Deposito() {
        this.capacidadMaxima = 5000;
        this.capacidadActual = 2000;
        this.capacidadUmbral = 500;
        this.elemento = "Agua";
    }

    //Métodos getters y setters
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

        //Si la cantidad pasada por parametro es mayor a la capacidad máxima
        //se igualará a la capacidad máxima sin sobrepasarla.
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

    //Método que rellena un depósito entero y
    //devuelve un mensaje monstrando que ha sido rellenado con éxito
    public void rellenarDepositoEntero(String elemento) {

        this.capacidadActual = this.capacidadMaxima;
        System.out.println("El depósito de " + elemento + " ha sido rellenado entero");
    }

    //Método que rellena una cantidad fija en un depósito
    public void rellenarDepositoCantidad(int cantidad, String elemento) {
        if (this.capacidadActual + cantidad >= capacidadMaxima) {
            System.out.println("Se ha rellenado el depósito de " + elemento
                    + " con " + cantidad);
            this.capacidadActual = capacidadMaxima;

        }
        if (cantidad > capacidadMaxima) {
            System.out.println("Se ha rellenado el depósito de " + elemento
                    + " con " + cantidad);
            this.capacidadActual = capacidadMaxima;
        }
        System.out.println("Se ha rellenado el depósito de " + elemento
                + " con " + cantidad);
        this.capacidadActual = this.capacidadActual + cantidad;
    }

    //Método toString
    @Override
    public String toString() {
        return "Deposito{" + "capacidadMaxima=" + capacidadMaxima + ", capacidadUmbral=" + capacidadUmbral + ", capacidadActual=" + capacidadActual + ", elemento=" + elemento + '}';
    }

}

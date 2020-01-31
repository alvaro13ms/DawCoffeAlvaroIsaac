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
public class Cafetera {

    private Deposito agua;
    private Deposito cafeSolo;
    private Deposito cafeSoloLargo;
    private Deposito cafeCortado;
    private Deposito cafeDescafeinado;
    private Deposito chocolate;
    private Deposito cafeLeche;
    private Deposito lecheFC;
    private double dineroConsumidor;
    private double dineroAcumulado;
    private UsuarioAdministrador admin;
    private static int numeroVentasHechas = 0;

    private final int cantidadAgua = 80;
    private final int cantidadcafeSolo = 74;
    private final int cantidadCafeSoloLargo = 69;
    private final int cantidadCafeCortado = 65;
    private final int cantidadcafeDescafeinado = 66;
    private final int cantidadChocolate = 78;
    private final int cantidadcafeLeche = 79;
    private final int cantidadlecheFC = 75;

    public Cafetera() {
        this.agua = new Deposito(800, 50, 500, "agua");
        this.cafeSolo = new Deposito(900, 50, 490, "Cafe Solo");
        this.cafeSoloLargo = new Deposito(780, 50, 600, "Cafe Solo Largo");
        this.cafeCortado = new Deposito(900, 50, 840, "Cafe Cortado");
        this.cafeDescafeinado = new Deposito(750, 50, 400, "Cafe Descafeinado");
        this.chocolate = new Deposito(1000, 50, 930, "Chocolate");
        this.cafeLeche = new Deposito(600, 50, 350, "Cafe Leche");
        this.lecheFC = new Deposito(950, 50, 800, "Leche FC");

    }

    public Cafetera(Deposito agua, Deposito cafeSolo, Deposito cafeSoloLargo, Deposito cafeCortado, Deposito cafeDescafeinado, Deposito chocolate, Deposito cafeLeche, Deposito lecheFC, double dineroConsumidor, double dineroAcumulado, UsuarioAdministrador admin) {
        this.agua = agua;
        this.cafeSolo = cafeSolo;
        this.cafeSoloLargo = cafeSoloLargo;
        this.cafeCortado = cafeCortado;
        this.cafeDescafeinado = cafeDescafeinado;
        this.chocolate = chocolate;
        this.cafeLeche = cafeLeche;
        this.lecheFC = lecheFC;
        this.dineroConsumidor = dineroConsumidor;
        this.dineroAcumulado = dineroAcumulado;
        this.admin = admin;
    }

}

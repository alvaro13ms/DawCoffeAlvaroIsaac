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

    //Declaración de atributos 
    private Deposito agua;
    private Deposito cafeSolo;
    private Deposito cafeSoloLargo;
    private Deposito cafeCortado;
    private Deposito cafeDescafeinado;
    private Deposito chocolate;
    private Deposito cafeLeche;
    private Deposito lecheFC;
    private Deposito azucar;
    private double dineroConsumidor;
    private double dineroAcumulado;
    private UsuarioAdministrador admin;
    private static int numeroVentasHechas = 0;

    //Atributos de la cantidad de cada componente de la cafetera
    private final int cantidadAgua = 80;
    private final int cantidadcafeSolo = 74;
    private final int cantidadCafeSoloLargo = 69;
    private final int cantidadCafeCortado = 65;
    private final int cantidadcafeDescafeinado = 66;
    private final int cantidadChocolate = 78;
    private final int cantidadcafeLeche = 79;
    private final int cantidadlecheFC = 75;
    private final int cantidadAzucar = 72;

    //Constructor por defecto
    public Cafetera() {
        this.agua = new Deposito(800, 50, 500, "agua");
        this.cafeSolo = new Deposito(900, 50, 490, "Cafe Solo");
        this.cafeSoloLargo = new Deposito(780, 50, 600, "Cafe Solo Largo");
        this.cafeCortado = new Deposito(900, 50, 840, "Cafe Cortado");
        this.cafeDescafeinado = new Deposito(750, 50, 400, "Cafe Descafeinado");
        this.chocolate = new Deposito(1000, 50, 930, "Chocolate");
        this.cafeLeche = new Deposito(600, 50, 350, "Cafe Leche");
        this.lecheFC = new Deposito(950, 50, 800, "Leche FC");
        this.azucar = new Deposito(675, 50, 515, "Azucar");

    }

    //Constructor parametrizado
    public Cafetera(Deposito agua, Deposito cafeSolo, Deposito cafeSoloLargo, Deposito cafeCortado, Deposito cafeDescafeinado, Deposito chocolate, Deposito cafeLeche, Deposito lecheFC, Deposito azucar, double dineroConsumidor, double dineroAcumulado, UsuarioAdministrador admin) {
        this.agua = agua;
        this.cafeSolo = cafeSolo;
        this.cafeSoloLargo = cafeSoloLargo;
        this.cafeCortado = cafeCortado;
        this.cafeDescafeinado = cafeDescafeinado;
        this.chocolate = chocolate;
        this.cafeLeche = cafeLeche;
        this.lecheFC = lecheFC;
        this.azucar = azucar;
        this.dineroConsumidor = dineroConsumidor;
        this.dineroAcumulado = dineroAcumulado;
        this.admin = admin;
    }

    //Métodos getters y setters
    public Deposito getAgua() {
        return agua;
    }

    public void setAgua(Deposito agua) {
        this.agua = agua;
    }

    public Deposito getCafeSolo() {
        return cafeSolo;
    }

    public void setCafeSolo(Deposito cafeSolo) {
        this.cafeSolo = cafeSolo;
    }

    public Deposito getCafeSoloLargo() {
        return cafeSoloLargo;
    }

    public void setCafeSoloLargo(Deposito cafeSoloLargo) {
        this.cafeSoloLargo = cafeSoloLargo;
    }

    public Deposito getCafeCortado() {
        return cafeCortado;
    }

    public void setCafeCortado(Deposito cafeCortado) {
        this.cafeCortado = cafeCortado;
    }

    public Deposito getCafeDescafeinado() {
        return cafeDescafeinado;
    }

    public void setCafeDescafeinado(Deposito cafeDescafeinado) {
        this.cafeDescafeinado = cafeDescafeinado;
    }

    public Deposito getChocolate() {
        return chocolate;
    }

    public void setChocolate(Deposito chocolate) {
        this.chocolate = chocolate;
    }

    public Deposito getCafeLeche() {
        return cafeLeche;
    }

    public void setCafeLeche(Deposito cafeLeche) {
        this.cafeLeche = cafeLeche;
    }

    public Deposito getLecheFC() {
        return lecheFC;
    }

    public void setLecheFC(Deposito lecheFC) {
        this.lecheFC = lecheFC;
    }

    public Deposito getAzucar() {
        return azucar;
    }

    public void setAzucar(Deposito azucar) {
        this.azucar = azucar;
    }

    public double getDineroConsumidor() {
        return dineroConsumidor;
    }

    public void setDineroConsumidor(double dineroConsumidor) {
        this.dineroConsumidor = dineroConsumidor;
    }

    public double getDineroAcumulado() {
        return dineroAcumulado;
    }

    public void setDineroAcumulado(double dineroAcumulado) {
        this.dineroAcumulado = dineroAcumulado;
    }

    public UsuarioAdministrador getAdmin() {
        return admin;
    }

    public void setAdmin(UsuarioAdministrador admin) {
        this.admin = admin;
    }

    //Método que devuelve el número de ventas hechas
    public static int getNumeroVentasHechas() {
        return numeroVentasHechas;
    }

    public static void setNumeroVentasHechas(int numeroVentasHechas) {
        Cafetera.numeroVentasHechas = numeroVentasHechas;
    }

//Cantidad que queda del cafe Solo con cada venta
    public void ServirCafeSolo() {
        cafeSolo.setCapacidadActual(cafeSolo.getCapacidadActual() - cantidadcafeSolo);
        agua.setCapacidadActual(agua.getCapacidadActual() - cantidadAgua);
        numeroVentasHechas++;

    }
    //Cantidad que queda del Cafe Largo con cada venta   

    public void ServirCafeLargo() {
        cafeSoloLargo.setCapacidadActual(cafeSoloLargo.getCapacidadActual() - cantidadCafeSoloLargo);
        agua.setCapacidadActual(agua.getCapacidadActual() - cantidadAgua);
        numeroVentasHechas++;

    }

    //Cantidad que queda del cafe Cortado con cada Venta    
    public void ServirCafeCortado() {
        cafeCortado.setCapacidadActual(cafeCortado.getCapacidadActual() - cantidadCafeCortado);
        agua.setCapacidadActual(agua.getCapacidadActual() - cantidadAgua);
        numeroVentasHechas++;

    }

    //Cantidad que queda del cafe Descafeinado con cada Venta    
    public void ServirCafeDescafeinado() {
        cafeDescafeinado.setCapacidadActual(cafeDescafeinado.getCapacidadActual() - cantidadcafeDescafeinado);
        agua.setCapacidadActual(agua.getCapacidadActual() - cantidadAgua);
        numeroVentasHechas++;

    }

    //Cantidad que queda del chocolate con cada Venta    
    public void ServirChocolate() {
        chocolate.setCapacidadActual(chocolate.getCapacidadActual() - cantidadChocolate);
        agua.setCapacidadActual(agua.getCapacidadActual() - cantidadAgua);
        numeroVentasHechas++;

    }

    //Cantidad que queda del cafe con leche con cada Venta    
    public void ServirCafeLeche() {
        cafeLeche.setCapacidadActual(cafeLeche.getCapacidadActual() - cantidadcafeLeche);
        agua.setCapacidadActual(agua.getCapacidadActual() - cantidadAgua);
        numeroVentasHechas++;
    }

    //Cantidad que queda del leche con cada Venta    
    public void ServirLecheFC() {
        lecheFC.setCapacidadActual(lecheFC.getCapacidadActual() - cantidadlecheFC);
        agua.setCapacidadActual(agua.getCapacidadActual() - cantidadAgua);
        numeroVentasHechas++;

    }

    //Cantidad que queda de Azucar con cada Venta    
    public void ServirAzucar() {
        azucar.setCapacidadActual(azucar.getCapacidadActual() - cantidadAzucar);

    }

    //Método que comprueba si algún depósito debe ser rellenado.
    public void comprobarDepositos(Deposito comprueba) {

        if (comprueba.getCapacidadActual() <= comprueba.getCapacidadUmbral()) {
            System.out.println("Tiene que ser rellenado " + comprueba.getElemento());
        } else {
            System.out.println("No hay que rellenar ningún deposito");
        }

    }

    //Método que comprueba el estado general de cada componente de la cafetera
    public void comprobarEstadoGeneralAgua() {

        System.out.println("El depósito de Agua");
        System.out.println("Capacidad Actual : " + getAgua().getCapacidadActual());
        System.out.println("Capacidad Máxima: " + getAgua().getCapacidadMaxima());
        System.out.println("CapacidadUmbral: " + getAgua().getCapacidadUmbral());

    }

    public void comprobarEstadoGeneralCafeSolo() {

        System.out.println("El depósito de CafeSolo");
        System.out.println("Capacidad Actual : " + getCafeSolo().getCapacidadActual());
        System.out.println("Capacidad Máxima: " + getCafeSolo().getCapacidadMaxima());
        System.out.println("CapacidadUmbral: " + getCafeSolo().getCapacidadUmbral());

    }

    public void comprobarEstadoGeneralCafeSoloLargo() {

        System.out.println("El depósito de Cafe Solo Largo");
        System.out.println("Capacidad Actual : " + getCafeSoloLargo().getCapacidadActual());
        System.out.println("Capacidad Máxima: " + getCafeSoloLargo().getCapacidadMaxima());
        System.out.println("CapacidadUmbral: " + getCafeSoloLargo().getCapacidadUmbral());

    }

    public void comprobarEstadoGeneralCafeCortado() {

        System.out.println("El depósito de Cafe Solo Cortado");
        System.out.println("Capacidad Actual : " + getCafeCortado().getCapacidadActual());
        System.out.println("Capacidad Máxima: " + getCafeCortado().getCapacidadMaxima());
        System.out.println("CapacidadUmbral: " + getCafeCortado().getCapacidadUmbral());

    }

    //Método toString
    @Override
    public String toString() {
        return "Cafetera{" + "agua=" + agua + ", cafeSolo=" + cafeSolo + ", cafeSoloLargo=" + cafeSoloLargo + ", cafeCortado=" + cafeCortado + ", cafeDescafeinado=" + cafeDescafeinado + ", chocolate=" + chocolate + ", cafeLeche=" + cafeLeche + ", lecheFC=" + lecheFC + ", azucar=" + azucar + ", dineroConsumidor=" + dineroConsumidor + ", dineroAcumulado=" + dineroAcumulado + ", admin=" + admin + ", cantidadAgua=" + cantidadAgua + ", cantidadcafeSolo=" + cantidadcafeSolo + ", cantidadCafeSoloLargo=" + cantidadCafeSoloLargo + ", cantidadCafeCortado=" + cantidadCafeCortado + ", cantidadcafeDescafeinado=" + cantidadcafeDescafeinado + ", cantidadChocolate=" + cantidadChocolate + ", cantidadcafeLeche=" + cantidadcafeLeche + ", cantidadlecheFC=" + cantidadlecheFC + ", cantidadAzucar=" + cantidadAzucar + '}';
    }

}

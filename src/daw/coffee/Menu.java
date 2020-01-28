/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.coffee;

import java.util.Scanner;

/**
 *
 * @author Isaac
 */
public class Menu {
    //Scanner para introducir datos por el teclado
Scanner teclado= new Scanner(System.in);
    //Creación de los atributos de los productos de la cafetera
    //Precio de los productos de la cafetera
    private double CAFESOLO=0.80;
    private double CAFESOLOLARGO=0.90;
    private double CAFELECHE=1.10;
    private double CORTADO=1;
    private double CHOCOLATE=1.40;
    private double LECHEFC=0.50;

    //Creación del constructor de los atributos
    public Menu(double CAFESOLO, double CAFESOLOLARGO, double CAFELECHE, double CORTADO, double CHOCOLATE, double LECHEFC) {
        this.CAFESOLO = CAFESOLO;
        this.CAFESOLOLARGO = CAFESOLOLARGO;
        this.CAFELECHE = CAFELECHE;
        this.CORTADO = CORTADO;
        this.CHOCOLATE = CHOCOLATE;
        this.LECHEFC = LECHEFC;
    }
    
    //Interfaz de la cafetera
    public void interfaz(){
        //Opcion a elegir para compenzar el programa
        System.out.println("Que opción deseas hacer?\n"
                + "1-Venta de los Productos\n"
                + "2-Administración");

        int opcion = teclado.nextInt();  
        
    
}
    //Creación del constructor predeterminado
    public Menu() {
    }

    //GET
    public double getCAFESOLO() {
        return CAFESOLO;
    }

    public double getCAFESOLOLARGO() {
        return CAFESOLOLARGO;
    }

    public double getCAFELECHE() {
        return CAFELECHE;
    }

    public double getCORTADO() {
        return CORTADO;
    }

    public double getCHOCOLATE() {
        return CHOCOLATE;
    }

    public double getLECHEFC() {
        return LECHEFC;
    }
    
    //SET

    public void setCAFESOLO(double CAFESOLO) {
        this.CAFESOLO = CAFESOLO;
    }

    public void setCAFESOLOLARGO(double CAFESOLOLARGO) {
        this.CAFESOLOLARGO = CAFESOLOLARGO;
    }

    public void setCAFELECHE(double CAFELECHE) {
        this.CAFELECHE = CAFELECHE;
    }

    public void setCORTADO(double CORTADO) {
        this.CORTADO = CORTADO;
    }

    public void setCHOCOLATE(double CHOCOLATE) {
        this.CHOCOLATE = CHOCOLATE;
    }

    public void setLECHEFC(double LECHEFC) {
        this.LECHEFC = LECHEFC;
    }

    
}

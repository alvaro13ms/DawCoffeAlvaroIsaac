/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw.coffee;

/**
 *
 * @author Isaac
 */
public class Menu {

    //Creación de los atributos de los productos de la cafetera
    private double CAFESOLO;
    private double CAFESOLOLARGO;
    private double CAFELECHE;
    private double CORTADO;
    private double CHOCOLATE;
    private double LECHEFC;

    //Creación del constructor de los atributos
    public Menu(double CAFESOLO, double CAFESOLOLARGO, double CAFELECHE, double CORTADO, double CHOCOLATE, double LECHEFC) {
        this.CAFESOLO = CAFESOLO;
        this.CAFESOLOLARGO = CAFESOLOLARGO;
        this.CAFELECHE = CAFELECHE;
        this.CORTADO = CORTADO;
        this.CHOCOLATE = CHOCOLATE;
        this.LECHEFC = LECHEFC;
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

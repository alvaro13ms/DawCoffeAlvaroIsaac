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

    
}

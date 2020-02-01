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
public class Programa {
    //Para poder ejecutar el programa
    public static void main(String[] args) {
        //Relación con la clase Menu
       Menu menu1=new Menu();
       //Relación con el interfaz de la cafetera
        menu1.interfaz();
         Cafetera cafetera=new Cafetera();
   
    }
    
}

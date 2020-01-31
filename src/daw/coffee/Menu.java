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

    Scanner teclado = new Scanner(System.in);
    //Creación de los atributos de los productos de la cafetera
    //Precio de los productos de la cafetera
    private final double CAFESOLO;
    private final double CAFESOLOLARGO;
    private final double CAFELECHE;
    private final double CORTADO;
    private final double CHOCOLATE;
    private final double LECHEFC;
    //Atributos adicionales
    double dinero, cafe;

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
    public void interfaz() {
        //Opcion a elegir para compenzar el programa
        System.out.println("Que opción deseas hacer?\n"
                + "1-Venta de los Productos\n"
                + "2-Administración");

        int opcion = teclado.nextInt();

        //Switch para hacer una de las dos opociones elegidas
        switch (opcion) {
            //Menu de productos
            case 1:
                //Introducir dinero a la maquina, teniendo un minimo posible
                do {
                    System.out.println("Introducir dinero:");
                    dinero = teclado.nextDouble();
                    System.out.println("--------------------");
                    if (dinero < this.LECHEFC) {
                        System.out.println("NO as introducido el dinero minimo para comprar algún producto");
                        System.out.println("------------------------");
                    }
                } while (dinero < this.LECHEFC);
                // Lista de productos que se puede elegir con una limitación para que solo pueda elegir entre esos codigos    
                do {

                    System.out.println("Productos:\n"
                            + "101-Cafe Solo 0.80 euros\n"
                            + "102-Cafe Solo Largo 0.90 euros\n"
                            + "103-Cafe con Leche 1.10 euros\n"
                            + "104-Cortado 1 euros\n"
                            + "105-Chocolate 1.40 euros\n"
                            + "106-Leche 0.50 euros");
                    cafe = teclado.nextInt();
                    System.out.println("---------------------");

                    if (cafe < 101 || cafe > 106) {
                        System.out.println("Codigo incorrecto");
                        System.out.println("-------------");
                        System.out.println("Vuelve a introducir un codigo");
                        System.out.println("--------------");
                    }
                } while (cafe < 101 || cafe > 106);

                break;
            //Autentificación del usuario
            case 2:

                UsuarioAdministrador a = new UsuarioAdministrador();
                String nombreUsuario;
                do {
                    System.out.println("Introduzca su nombre de usuario");
                    nombreUsuario = teclado.nextLine();
                } while (!(nombreUsuario.equalsIgnoreCase(a.getUsuario())));

                String contraseniaUsuario;

                do {
                    System.out.println("Introduzca su contraseña");
                    contraseniaUsuario = teclado.nextLine();
                } while (!(contraseniaUsuario.equalsIgnoreCase(a.getContrasenia())));

                System.out.println("Has accedido correctamente a la administración de la cafetera");
                System.out.println("Pulsa cualquier botón");
                teclado.nextLine();
                int opcionAdministrar;

                do {
                    System.out.println("Pulse 1 para comprobar los depósitos");
                    System.out.println("Pulse 2 para comprobar el estado general");
                    System.out.println("Pulse 3 para consultar el saldo de ventas");
                    System.out.println("Pulse 4 para rellenar depósitos");

                    opcionAdministrar = teclado.nextInt();
                } while (opcionAdministrar < 1 || opcionAdministrar > 4);
                break;

        }

    }

    //Creación del constructor predeterminado
    public Menu() {
        this.CAFESOLO = 0.80;
        this.CAFESOLOLARGO = 0.90;
        this.CAFELECHE = 1.10;
        this.CORTADO = 1;
        this.CHOCOLATE = 1.40;
        this.LECHEFC = 0.50;
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

}

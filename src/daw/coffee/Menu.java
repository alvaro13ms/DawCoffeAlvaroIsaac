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
    //Relación de la clase Menu con la clase Cafetera
    Cafetera relacionC = new Cafetera();
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
    double dinero, dinero2, resultado;
    int cafe, opcionS, opcionD, azucar;
    boolean salir = false;

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

                    switch (cafe) {

                        case 101:
                            //Introducir el dinero necesario para comprar el cafe solo ó volver al menu
                            if (dinero < this.CAFESOLO) {
                                do {
                                    System.out.println("No as introducido suficiente dinero\n"
                                            + "1-Agregar dinero\n"
                                            + "2-Volver al menu");
                                    System.out.println("---------------------");
                                    opcionS = teclado.nextInt();
                                    System.out.println("---------------------");
                                    //Agregar dinero para pagar el producto
                                    switch (opcionS) {

                                        case 1:
                                            System.out.println("Agregar dinero:");
                                            dinero2 = teclado.nextDouble();
                                            dinero = dinero + dinero2;
                                            System.out.println("---------------------");
                                            System.out.printf("Saldo de cliente actual: %.2f euros ", dinero);

                                            System.out.println("");

                                            break;
                                        //Volver al menu
                                        case 2:
                                            salir = false;
                                            break;

                                    }

                                } while (dinero < this.CAFESOLO);
                            }

                            //Opción de quererlo descafinado o no
                            System.out.println("");
                            System.out.println("------------------------------");

                            System.out.println("Lo deseas descafeinado?\n"
                                    + "1-Si\n"
                                    + "2-No");
                            System.out.println("--------------------");
                            opcionD = teclado.nextInt();
                            System.out.println("--------------------");
                            resultado = dinero - this.CAFESOLO;
                            //Opción para saber si quiere azucar
                            System.out.println("-------------------");
                            System.out.println("Desea azucar?\n"
                                    + "1-Si\n"
                                    + "2-No");
                            System.out.println("------------------");
                            azucar = teclado.nextInt();
                            System.out.println("---------------------");
                            switch (opcionD) {
                                //resultado
                                case 1:
                                    System.out.printf("El cafe solo (Descafeinado) cuesta 0.80 euros por lo que el cambio será de: %.2f euros", resultado);
                                    break;

                                case 2:
                                    System.out.printf("El cafe solo cuesta 0.80 euros por lo que el cambio será de: %.2f euros", resultado);
                                    break;
                            }

                            break;

                        case 102:

                            break;

                        case 103:

                            break;

                        case 104:

                            break;

                        case 105:

                            break;

                        case 106:

                            break;
                    }
                } while (salir == false);
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

                System.out.println(
                        "Has accedido correctamente a la administración de la cafetera");
                System.out.println(
                        "Pulsa cualquier botón");
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

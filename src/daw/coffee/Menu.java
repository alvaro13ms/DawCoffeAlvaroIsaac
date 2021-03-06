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
    int cafe, opcionS, opcionD, azucar, temperatura;
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

        //Opcion a elegir para comenzar el programa
        boolean repetir = true;

        do {

            int opcion;
            do {

                System.out.println("");
                System.out.println("");
                System.out.println("---------------------------------------------------------------------------------");
                System.out.println("");

                System.out.println("Que opción deseas hacer?\n"
                        + "1-Venta de los Productos\n"
                        + "2-Administración\n"
                        + "3-Salir\n");

                opcion = teclado.nextInt();
            } while (opcion < 1 || opcion > 3);
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
                            System.out.println("NO has introducido el dinero minimo para comprar algún producto");
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

                    switch (cafe) {

                        case 101:
                            //Introducir el dinero necesario para comprar el cafe solo ó volver al menu
                            if (dinero < this.CAFESOLO) {
                                do {
                                    System.out.println("No has introducido suficiente dinero\n"
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
                            //Gasto del azucar de los depositos
                            if (azucar == 1) {
                                relacionC.ServirAzucar();
                            }
                            switch (opcionD) {
                                //resultado
                                case 1:
                                    System.out.printf("El cafe solo (Descafeinado) cuesta 0.80 euros por lo que el cambio será de: %.2f euros", resultado);
                                    //Gasto del producto en los depositos
                                    relacionC.ServirCafeSolo();
                                    relacionC.ServirCafeDescafeinado();
                                    break;

                                case 2:
                                    System.out.printf("El cafe solo cuesta 0.80 euros por lo que el cambio será de: %.2f euros", resultado);
                                    //Gasto del producto en los depositos
                                    relacionC.ServirCafeSolo();
                                    break;

                            }

                            break;

                        case 102:
                            //Introducir el dinero necesario para comprar el cafe solo Largo ó volver al menu
                            if (dinero < this.CAFESOLOLARGO) {
                                do {
                                    System.out.println("No has introducido suficiente dinero\n"
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

                                } while (dinero < this.CAFESOLOLARGO);
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
                            resultado = dinero - this.CAFESOLOLARGO;
                            //Opción para saber si quiere azucar
                            System.out.println("-------------------");
                            System.out.println("Desea azucar?\n"
                                    + "1-Si\n"
                                    + "2-No");
                            System.out.println("------------------");
                            azucar = teclado.nextInt();
                            System.out.println("---------------------");
                            //Gasto del azucar de los depositos
                            if (azucar == 1) {
                                relacionC.ServirAzucar();
                            }
                            switch (opcionD) {
                                //resultado
                                case 1:
                                    System.out.printf("El cafe solo Largo (Descafeinado) cuesta 0.90 euros por lo que el cambio será de: %.2f euros", resultado);
                                    //Gasto del producto en los depositos
                                    relacionC.ServirCafeLargo();
                                    relacionC.ServirCafeDescafeinado();
                                    break;

                                case 2:
                                    System.out.printf("El cafe solo Largo cuesta 0.90 euros por lo que el cambio será de: %.2f euros", resultado);
                                    //Gasto del producto en los depositos
                                    relacionC.ServirCafeLargo();
                                    break;

                            }

                            break;

                        case 103:
                            //Introducir el dinero necesario para comprar el cafe con Leche ó volver al menu
                            if (dinero < this.CAFELECHE) {
                                do {
                                    System.out.println("No has introducido suficiente dinero\n"
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

                                } while (dinero < this.CAFELECHE);
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
                            resultado = dinero - this.CAFELECHE;
                            //Opción para saber si quiere azucar
                            System.out.println("-------------------");
                            System.out.println("Desea azucar?\n"
                                    + "1-Si\n"
                                    + "2-No");
                            System.out.println("------------------");
                            azucar = teclado.nextInt();
                            System.out.println("---------------------");
                            //Gasto del azucar de los depositos
                            if (azucar == 1) {
                                relacionC.ServirAzucar();
                            }
                            switch (opcionD) {
                                //resultado
                                case 1:
                                    System.out.printf("El cafe con Leche (Descafeinado) cuesta 1.10 euros por lo que el cambio será de: %.2f euros", resultado);
                                    //Gasto del producto en los depositos
                                    relacionC.ServirCafeLeche();
                                    relacionC.ServirCafeDescafeinado();
                                    break;

                                case 2:
                                    System.out.printf("El cafe con Leche cuesta 1.10 euros por lo que el cambio será de: %.2f euros", resultado);
                                    //Gasto del producto en los depositos
                                    relacionC.ServirCafeLeche();
                                    break;

                            }

                            break;

                        case 104:
                            //Introducir el dinero necesario para comprar el cortado ó volver al menu
                            if (dinero < this.CORTADO) {
                                do {
                                    System.out.println("No has introducido suficiente dinero\n"
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

                                } while (dinero < this.CORTADO);
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
                            resultado = dinero - this.CORTADO;
                            //Opción para saber si quiere azucar
                            System.out.println("-------------------");
                            System.out.println("Desea azucar?\n"
                                    + "1-Si\n"
                                    + "2-No");
                            System.out.println("------------------");
                            azucar = teclado.nextInt();
                            System.out.println("---------------------");
                            //Gasto del azucar de los depositos
                            if (azucar == 1) {
                                relacionC.ServirAzucar();
                            }
                            switch (opcionD) {
                                //resultado
                                case 1:
                                    System.out.printf("El cortado (Descafeinado) cuesta 1 euro por lo que el cambio será de: %.2f euros", resultado);
                                    //Gasto del producto en los depositos
                                    relacionC.ServirCafeCortado();
                                    relacionC.ServirCafeDescafeinado();
                                    break;

                                case 2:
                                    System.out.printf("El cortado cuesta 1 euro por lo que el cambio será de: %.2f euros", resultado);
                                    //Gasto del producto en los depositos
                                    relacionC.ServirCafeCortado();
                                    break;

                            }

                            break;

                        case 105:
//Introducir el dinero necesario para comprar el chocolate ó volver al menu
                            if (dinero < this.CHOCOLATE) {
                                do {
                                    System.out.println("No has introducido suficiente dinero\n"
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

                                } while (dinero < this.CHOCOLATE);
                            }

                            resultado = dinero - this.CHOCOLATE;
                            //Opción para saber si quiere azucar
                            System.out.println("-------------------");
                            System.out.println("Desea azucar?\n"
                                    + "1-Si\n"
                                    + "2-No");
                            System.out.println("------------------");
                            azucar = teclado.nextInt();
                            System.out.println("---------------------");
                            //Gasto del azucar de los depositos
                            if (azucar == 1) {
                                relacionC.ServirAzucar();
                            }

                            //resultado
                            System.out.printf("El chocolate cuesta 1,40 euro por lo que el cambio será de: %.2f euros", resultado);
                            //Gasto del producto en los depositos
                            relacionC.ServirChocolate();
                            break;

                        case 106:

                            resultado = dinero - this.LECHEFC;
                            System.out.println("Lo desea Caliente o Frio?\n"
                                    + "1-Caliente\n"
                                    + "2-Frio");
                            System.out.println("------------------");
                            temperatura = teclado.nextInt();
                            //Opción para saber si quiere azucar
                            System.out.println("-------------------");
                            System.out.println("Desea azucar?\n"
                                    + "1-Si\n"
                                    + "2-No");
                            System.out.println("------------------");
                            azucar = teclado.nextInt();
                            System.out.println("---------------------");
                            //Gasto del azucar de los depositos
                            if (azucar == 1) {
                                relacionC.ServirAzucar();
                            }

                            switch (temperatura) {
                                //resultado
                                case 1:
                                    System.out.printf("La leche (Caliente) cuesta 0,5 euros por lo que el cambio será de: %.2f euros", resultado);
                                    //Gasto del producto en los depositos
                                    relacionC.ServirLecheFC();

                                    break;

                                case 2:
                                    System.out.printf("La Leche (Fria)cuesta 0,5 euros por lo que el cambio será de: %.2f euros", resultado);
                                    //Gasto del producto en los depositos
                                    relacionC.ServirLecheFC();
                                    break;

                            }
                    }

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

                    if (opcionAdministrar == 1) {
                        Cafetera c = new Cafetera();
                        Deposito prueba = new Deposito();
                        c.comprobarDepositos(prueba);
                    }

                    if (opcionAdministrar == 2) {
                        Cafetera d = new Cafetera();
                        d.comprobarEstadoGeneralAgua();
                        System.out.println("----------------------------------------");
                        d.comprobarEstadoGeneralAzucar();
                        System.out.println("----------------------------------------");
                        d.comprobarEstadoGeneralCafeCortado();
                        System.out.println("----------------------------------------");
                        d.comprobarEstadoGeneralCafeDescafeinado();
                        System.out.println("----------------------------------------");
                        d.comprobarEstadoGeneralCafeSolo();
                        System.out.println("----------------------------------------");
                        d.comprobarEstadoGeneralCafeSoloLargo();
                        System.out.println("----------------------------------------");
                        d.comprobarEstadoGeneralChocolate();
                        System.out.println("----------------------------------------");
                        d.comprobarEstadoGeneralLecheFC();

                    }

                    if (opcionAdministrar == 3) {
                        Cafetera e = new Cafetera();
                        e.getDineroAcumulado();
                    }
                    if (opcionAdministrar == 4) {
                        Deposito f = new Deposito();
                        int elegirRellenar;
                        do {
                            System.out.println("1 para rellenar un depósito entero");
                            System.out.println("2 para indicar una cantidad");
                            elegirRellenar = teclado.nextInt();
                        } while (elegirRellenar < 1 || elegirRellenar > 2);

                        if (elegirRellenar == 1) {
                            Deposito i = new Deposito();
                            int depositoConcreto;
                            do {
                                System.out.println("1 para rellenar el depósito de agua");
                                System.out.println("2 para rellenar el depósito de Cafe Solo");
                                System.out.println("3 para rellenar el depósito de Cafe Solo Largo");
                                System.out.println("4 para rellenar el depósito de Cafe Cortado");
                                System.out.println("5 para rellenar el depósito de Cafe Descafeinado");
                                System.out.println("6 para rellenar el depósito de Chocolate");
                                System.out.println("7 para rellenar el depósito de Cafe Leche");
                                System.out.println("8 para rellenar el depósito de Leche FC");
                                System.out.println("9 para rellenar el depósito de Azucar");
                                depositoConcreto = teclado.nextInt();
                            } while (depositoConcreto < 1 || depositoConcreto > 9);

                            if (depositoConcreto == 1) {
                                Deposito agua = new Deposito();
                                i.rellenarDepositoEntero("agua");
                                agua.getCapacidadMaxima();

                            }

                            if (depositoConcreto == 2) {
                                Deposito cafeSolo = new Deposito();
                                i.rellenarDepositoEntero("Cafe Solo");
                                cafeSolo.getCapacidadMaxima();

                            }

                            if (depositoConcreto == 2) {
                                Deposito cafeSolo = new Deposito();
                                i.rellenarDepositoEntero("Cafe Solo");
                                cafeSolo.getCapacidadMaxima();

                            }

                            if (depositoConcreto == 3) {
                                Deposito cafeSoloLargo = new Deposito();
                                i.rellenarDepositoEntero("Cafe Solo Largo");
                                cafeSoloLargo.getCapacidadMaxima();

                            }

                            if (depositoConcreto == 4) {
                                Deposito cafeCortado = new Deposito();
                                i.rellenarDepositoEntero("Cafe Cortado");
                                cafeCortado.getCapacidadMaxima();

                            }

                            if (depositoConcreto == 5) {
                                Deposito cafeDescafeinado = new Deposito();
                                i.rellenarDepositoEntero("Cafe Descafeinado");
                                cafeDescafeinado.getCapacidadMaxima();

                            }

                            if (depositoConcreto == 6) {
                                Deposito chocolate = new Deposito();
                                i.rellenarDepositoEntero("Chocolate");
                                chocolate.getCapacidadMaxima();

                            }

                            if (depositoConcreto == 7) {
                                Deposito cafeLeche = new Deposito();
                                i.rellenarDepositoEntero("Cafe Leche");
                                cafeLeche.getCapacidadMaxima();

                            }

                            if (depositoConcreto == 8) {
                                Deposito lecheFC = new Deposito();
                                i.rellenarDepositoEntero("Leche FC");
                                lecheFC.getCapacidadMaxima();

                            }

                            if (depositoConcreto == 9) {
                                Deposito azucar = new Deposito();
                                i.rellenarDepositoEntero("Azucar");
                                azucar.getCapacidadMaxima();

                            }
                        }

                        if (elegirRellenar == 2) {
                            Deposito rellenarCantidad = new Deposito();
                            int elegirCantidadDeposito;
                            do {
                                System.out.println("1 para rellenar una cantidad del depósito de agua");
                                System.out.println("2 para rellenar una cantidad del depósito de Cafe Solo");
                                System.out.println("3 para rellenar una cantidad del depósito de Cafe Solo Largo");
                                System.out.println("4 para rellenar una cantidad del depósito de Cafe Cortado");
                                System.out.println("5 para rellenar una cantidad del depósito de Cafe Descafeinado");
                                System.out.println("6 para rellenar una cantidad del depósito de Chocolate");
                                System.out.println("7 para rellenar una cantidad del depósito de Cafe Leche");
                                System.out.println("8 para rellenar una cantidad del depósito de Leche FC");
                                System.out.println("9 para rellenar una cantidad del depósito de Azucar");
                                elegirCantidadDeposito = teclado.nextInt();
                            } while (elegirCantidadDeposito < 1 || elegirCantidadDeposito > 9);

                            if (elegirCantidadDeposito == 1) {
                                System.out.println("Escribe la cantidad a rellenar en el depósito de agua");
                                int cantidad = teclado.nextInt();
                                rellenarCantidad.rellenarDepositoCantidad(cantidad, "agua");
                            }

                            if (elegirCantidadDeposito == 2) {
                                System.out.println("Escribe la cantidad a rellenar en el depósito de Cafe Solo");
                                int cantidad = teclado.nextInt();
                                rellenarCantidad.rellenarDepositoCantidad(cantidad, "cafe solo");
                            }

                            if (elegirCantidadDeposito == 3) {
                                System.out.println("Escribe la cantidad a rellenar en el depósito de Cafe Solo Largo");
                                int cantidad = teclado.nextInt();
                                rellenarCantidad.rellenarDepositoCantidad(cantidad, "cafe solo largo");
                            }

                            if (elegirCantidadDeposito == 4) {
                                System.out.println("Escribe la cantidad a rellenar en el depósito de Cafe Cortado");
                                int cantidad = teclado.nextInt();
                                rellenarCantidad.rellenarDepositoCantidad(cantidad, "cafe cortado");
                            }

                            if (elegirCantidadDeposito == 5) {
                                System.out.println("Escribe la cantidad a rellenar en el depósito de Cafe Descafeinado");
                                int cantidad = teclado.nextInt();
                                rellenarCantidad.rellenarDepositoCantidad(cantidad, "cafe descafeinado");
                            }

                            if (elegirCantidadDeposito == 6) {
                                System.out.println("Escribe la cantidad a rellenar en el depósito de Chocolate");
                                int cantidad = teclado.nextInt();
                                rellenarCantidad.rellenarDepositoCantidad(cantidad, "chocolate");
                            }

                            if (elegirCantidadDeposito == 7) {
                                System.out.println("Escribe la cantidad a rellenar en el depósito de Cafe Leche");
                                int cantidad = teclado.nextInt();
                                rellenarCantidad.rellenarDepositoCantidad(cantidad, "cafe leche");
                            }

                            if (elegirCantidadDeposito == 8) {
                                System.out.println("Escribe la cantidad a rellenar en el depósito de Leche FC");
                                int cantidad = teclado.nextInt();
                                rellenarCantidad.rellenarDepositoCantidad(cantidad, "leche fc");
                            }

                            if (elegirCantidadDeposito == 9) {
                                System.out.println("Escribe la cantidad a rellenar en el depósito de azucar");
                                int cantidad = teclado.nextInt();
                                rellenarCantidad.rellenarDepositoCantidad(cantidad, "azucar");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    repetir = false;
                    break;
            }
        } while (repetir);
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

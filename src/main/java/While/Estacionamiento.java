package While;

import java.util.Scanner;

public class Estacionamiento
/*
Este ejercicio es tanto de for cm de while
*/
        /*
        varios clientes:
        El programa debe solicitar por teclado dos datos:
        La patente del vehículo
        El tipo de estacionamiento
        */
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String placa = "";
        int tipoEst, horas, cont1 = 0, cont2 = 0, cont3 = 0;
        double total, totalDia = 0;

        /* El programa debe calcular el monto a pagar para cada cliente en función
        del tipo de estacionamiento seleccionado. La carga de datos debe
        continuar hasta que el usuario ingrese la palabra "FIN" en lugar de la
        patente.
        */

        while (!placa.equalsIgnoreCase("fin")) {
            System.out.println("Indica el tipo de placa");
            placa = sc.nextLine();

            //Si la placa NO es igual a fin, sigue el codigo normal, si no ya aparece el resumen
            if (!placa.equalsIgnoreCase("fin")) {


                System.out.println("Los tipos de estacionamientos posibles son:");
                System.out.println("1.- Por hora ($3), 2.- media jornada($15 con 5% de descuento) y 3.- jornada completa($30 con 10% de descuento)");
                sc = new Scanner(System.in);
                tipoEst = sc.nextInt();

                if (tipoEst <= 0 || tipoEst > 3) {
                    System.out.println("No se permiten numeros menores a 3");
                } else {
                        /* Los tipos de estacionamiento disponibles son 3:
                        -Por hora (cuyo valor es de $3 USD por hora)
                        -Media jornada (cuyo valor total es de $15 USD y posee 5% de descuento)
                        -Jornada completa (cuyo valor fijo es de $30 USD y posee 10% de descuento)
                */
                    if (tipoEst == 1) {
                        System.out.println("Ingrese las horas que se quedará");
                        sc = new Scanner(System.in);
                        horas = sc.nextInt();
                        total = horas * 3;
                        System.out.println("El total a pagar sería de $" + total);
                        //Los contadores son para contar cuantas veces se eligió la opcion1, 2 y 3
                        //Entonces al momento de contarlos se agrega 1,2,3,4,etc.
                        cont1++;
                        totalDia = totalDia + total;
                    } else {
                        if (tipoEst == 2) {
                            System.out.println("Recuerda, media jornada son 5hrs");
                            total = 15 * 0.95;
                            System.out.println("El total a pagar sería de $" + total);
                            cont2++;
                            totalDia = totalDia + total;
                        } else {
                                System.out.println("Recuerda, jornada completa son 10hrs");
                                total = 30 * 0.90;
                                System.out.println("El total a pagar sería de $" + total);
                                cont3++;
                                totalDia = totalDia + total;
                        }
                    }
                    System.out.println("----------¡MUCHAS GRACIAS POR SU COMPRA!, con ese dinero me voy con unas cariñosas yiyi papa-------------");
                }
                //Aquí importante resetear el scanner para que vuelva a leer el String
                sc = new Scanner(System.in);
            }
        }
        System.out.println("====================================================================================================");
        System.out.println("Cantidad de Servicios por hora: " + cont1);
        System.out.println("Cantidad de Servicios por media jornada: " + cont2);
        System.out.println("Cantidad de Servicios por jornada completa: " + cont3);
        System.out.println("El total de su compra es $" + totalDia);
    }
}

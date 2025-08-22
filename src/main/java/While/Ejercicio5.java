package While;

import java.util.Scanner;

public class Ejercicio5
    /*
    Realizar un programa que muestre en pantalla palabras
    que sean ingresadas por teclado hasta que se ingrese la palabra “salir”.
    */
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.println("Ingresa la palabra clave jeje, cuál será zorra?");
        //El sc.next(); no nos sirve pq eso es para una palabra
        //El sc.nextLine(); Sirve para una o más palabras, cm en este caso
        palabra = sc.nextLine();

        while (!palabra.equalsIgnoreCase("salir")) {
            System.out.println("La palabra es: " + palabra);

            System.out.println("No es la palabra clave");
            palabra = sc.nextLine();
        }
        System.out.println("Bieen, saliste del bucle maldita zorra");
    }
}

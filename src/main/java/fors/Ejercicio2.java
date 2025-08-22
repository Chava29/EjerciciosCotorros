package fors;

import java.util.Scanner;

public class Ejercicio2

     /* Realizar un programa que dado por teclado un límite numérico (por ejemplo 100)
    muestre en pantalla todos los números hasta ese límite (empezando por 1).
    */

{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un numero que quiera que apareza en pantalla hasta el limite");
        numero = scanner.nextInt();

        for (int i = 0; i<numero; i++)
        {
            System.out.println(i+1);
        }
    }
}

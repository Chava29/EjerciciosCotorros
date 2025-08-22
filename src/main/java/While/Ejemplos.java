package While;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejemplos
{
    public static void main(String[] args)
    {
        /*int contador = 0;

        while(contador<10){
            System.out.println("Voy en el contador " + contador);
            contador++;
        }*/

        //bucle controlado por centinela
        boolean bandera = true;
        String respuesta;
        Scanner scanner = new Scanner(System.in);

        while (bandera == true){
            System.out.println("El valor de mi bandera es " + bandera);
            System.out.println("Me sigues en ig? " + true);

            System.out.println("Quieres dejar de seguirme? :d");
            respuesta = scanner.next();

            //Lo que dice esto es: Si mi respuesta es(equals) si, entonces.
            // IgnoreCase le da igual si es mayusculas o minusculas
            if (respuesta.equalsIgnoreCase("si")){
                bandera = false;
                System.out.println("Gei");
            }
            System.out.println("-----------------------");
        }
    }
}

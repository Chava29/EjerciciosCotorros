import java.util.Scanner;

public class Inicio

{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int edad;

        System.out.println("Bienvenido a la high school bla blaa");
        System.out.println("Ingresa el nombre de tu hijo y de acuerdo a  su edad se asiganará el grupo y horario");
        System.out.println("La edades solo son 4,6,7,8,9,10,11,12 y 13");
        edad = scanner.nextInt();

        if(edad >=4 && edad<=6){
            System.out.println("Lunes y miercoles de 16 a 17");
        }
        else {
            if(edad >=7 && edad<=8) {
                System.out.println("Martes y Jueves de 16:30 a 17:30");
            }
            else {
                if(edad >=9 && edad<=10) {
                    System.out.println("Martes y Jueves de 17:30 a 9");
                }
                else{
                    if(edad >=11 && edad<=13) {
                System.out.println("Lunes y miercoles de 17 a 18:30");
                    }
                }
            }
        }
        System.out.println("----------------------------------------------");
    }
}

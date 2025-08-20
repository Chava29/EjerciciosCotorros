import java.util.Scanner;

public class Merceria {

    public static void main(String[] args) {

        //Merceria mayoriste ----- vende al por mayor
        // Menos de 5 packs NO VENDE
        //Entre 5 y 16 productos el envio cuesta 10USD
        // Más de 15p es gratis :)

        int producto;
        double dinero, diferencia, descuento, montoDescuento;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Holis somos una tienda mayorista, ingresa el numero de productos que quieres comprar");
        System.out.println("Recuerda que eres una gran persona y estoy orgulloso de tí<>");
        producto = scanner.nextInt();

        if (producto < 5) {
            if (producto < 0) {
                System.out.println("No se permiten compras negativas >:v, no seas pndejo");
            }else{
                System.out.println("No se permiten compras menores a 5 productos");
            }
            System.out.println("No se vende, sorry la cantidad de productos seleccionada es: " + producto + " producto/s");
        }
        else {
            System.out.println("tmb ingresa cuantos USD cuestan tus productos en total");
            scanner = new Scanner(System.in); //Esto lo hacemos para no crear otro scanner y reutilizarlo, al hacer esto el scanner se vuelve otra vez 0
            dinero = scanner.nextDouble();

            if (producto>=5 && producto<=15) {
                System.out.println("Muy bn, recuerda que el envío es de 10USD :(");
                dinero= dinero + 10;
            }
            else {
                System.out.println("Bieen, como compraste " + producto + " productos el envío será gratis bro");
            }

            if (dinero<100) {
                diferencia = 100-dinero; //Esto es un operador ternario
                System.out.println("No hay promociones bro, necesitas 100USD minimo para una promoción, por lo tanto le faltan: $" + diferencia + " para entrar en promo"
                + "El monto total es " + dinero);
            }
            else {

                if (dinero>100 && dinero<=300) {
                    descuento = dinero*0.05;
                    montoDescuento = dinero-descuento;
                    System.out.println("Se aplicará un descuento del 5% que equivale a " + descuento + " así que el nuevo monto es de $" + montoDescuento);
                }
                else{
                    descuento = dinero * 0.10;
                    montoDescuento = dinero-descuento;
                    System.out.println("Se aplicará un descuento del 10% que equivale a " + descuento + " así que el nuevo monto es de $" + montoDescuento);
                }
            }
        }
    }
}
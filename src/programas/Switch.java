package programas;
import java.util.Scanner;
public class Switch {
    public static void controlswitch()

    {
        //public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese Operación\n 1.Suma\n 2.Resta\n 3.Multiplicación\n 4.División");

        int opcion = entrada.nextInt();
        double a, b;

        switch (opcion) {
            case 1:
                System.out.println("Ingrese Primer Número");
                a = entrada.nextInt();
                System.out.println("Ingrese Segundo Número");
                b = entrada.nextInt();
                System.out.println("La Suma es " + (a + b));
                break;
            case 2:
                System.out.println("Ingrese Primer Número");
                a = entrada.nextInt();
                System.out.println("Ingrese Segundo Número");
                b = entrada.nextInt();
                System.out.println("La Resta es: " + (a - b));
                break;
            case 3:
                System.out.println("Ingrese Primer Número");
                a = entrada.nextInt();
                System.out.println("Ingrese Segundo Número");
                b = entrada.nextInt();
                System.out.println("La Multiplicación es: " + (a * b));
                break;
            case 4:
                System.out.println("Ingrese Primer Número");
                a = entrada.nextInt();
                System.out.println("Ingrese Segundo Número");
                b = entrada.nextInt();
                System.out.print("La División es: ");
                System.out.printf("%1.2f", (a / b));
                break;
            default:
                System.out.println("No ha seleccionado una operación");
                break;
        }
    }
    }
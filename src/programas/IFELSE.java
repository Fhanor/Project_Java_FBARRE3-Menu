package programas;
import java.util.Scanner;
public class IFELSE {
    public static void ifelse() {

            System.out.println("Ingresa la edad del usuario:");
            Scanner input = new Scanner(System.in);

            byte edad = input.nextByte();

            if (edad >= 18) {
                System.out.println("El Pirobis es mayor de edad.");
            } else {
                System.out.println("El Pirobis es menor de edad.");
            }
        }
    }
package programas;
import java.util.Scanner;
public class IfElse{
    public static void controlifelse() {

        System.out.println("Ingrese Edad:");
        Scanner input = new Scanner(System.in);
        byte edad = input.nextByte();

        if (edad >= 18) {
            System.out.println("El Pirobis es mayor de edad");
        } else {
            System.out.println("El Pirobis es menor de edad");
        }
    }
}
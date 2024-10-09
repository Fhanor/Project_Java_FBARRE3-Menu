package programas;
import java.util.Scanner;
public class Ternario {
       public static void controlternario() {
           Scanner lectura = new Scanner(System.in);
           System.out.println("Ingrese Edad:");
           int edad = lectura.nextInt();
           String status=(edad>=18)?"mayor de edad":"menor de edad";
            System.out.println("El Pirobis es:"+status);
        }
    }


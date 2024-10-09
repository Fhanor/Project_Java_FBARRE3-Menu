package programas;

import java.util.Scanner;
public class While {
    public static void controlwhile(){
        Scanner entrada= new Scanner(System.in);
        int respuesta = 0;
        while( respuesta != 2 ) {
            System.out.println("1.Conservar Conección al Sistema");
            System.out.println("2.Desconectarse del Sistema");
            System.out.print("Elije una opción:");
            respuesta = entrada.nextInt();
            System.out.println("Elegiste la opción\n"+respuesta);
            System.out.println();
        }
        System.out.println("Elegiste desconectarte; ahora estas desconectado del Sistema");
    }
}
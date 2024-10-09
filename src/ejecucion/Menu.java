/*Banco de Bogotá*/
/*Fundamentos de Programación*/
/*Menu.java*/
/*Fhanor Barreto Libreros*/
/*Oswaldo Andrés Gonzalez Bello*/
/*Octubre 2024*/

package ejecucion;
import menus.MenuPrincipal;
import programas.*;
import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {

       MenuPrincipal.menuprincipal();
       Scanner Teclado = new Scanner(System.in);
       int MenuGeneral = Teclado.nextInt();
       boolean salir;
       salir = false;

        switch (MenuGeneral) {
            case 1:
                System.out.println("Datos Primitivos ");
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Los datos primitivos son los tipos de datos más básicos que existen en Java.");
                System.out.println("No son objetos y representan valores en bruto.");
                System.out.println("Hay ocho tipos de datos primitivos que se pueden dividir en cuatro categorías:");
                System.out.println("Números enteros: byte, short, int, long.");
                System.out.println("Números reales: float, double.");
                System.out.println("Carácter: char.");
                System.out.println("Booleano o lógico: boolean.");
                System.out.println("------------------------------------------------------------------------------");
                break;
            case 2:
                System.out.println("String");
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("El tipo de dato String es una clase que representa cadenas de caracteres");
                System.out.println("y se utiliza ampliamente en aplicaciones para almacenar y manipular texto.");
                System.out.println("En Java, una cadena de texto se define utilizando comillas dobles (\" \").");
                System.out.println("------------------------------------------------------------------------------");
                break;
            case 3:
                System.out.println("Constantes");
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
                System.out.println("La palabra clave que Java ha reservado para definir constantes es la palabra final.");
                System.out.println("En Java es muy simple definir constantes, solo basta con ponerles el modificador final antes de la declaración del tipo.");
                System.out.println("Al definir un dato como constante le podremos asignar un valor por primera vez y luego NO será posible cambiar el valor.");
                System.out.println("Una vez inicializado el dato, este no podrá cambiar su valor de ninguna forma.");
                System.out.println("------------------------------------------------------------------------------------------------------------------------");
                break;
            case 4:
                System.out.println("Tipo Operadores");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Los operadores en Java son símbolos especiales que se utilizan para realizar operaciones en variables y valores.");
                System.out.println("Los operadores aritméticos se utilizan para realizar operaciones matemáticas, como suma (+), resta (-), multiplicación (*), división (/) y módulo (%).");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------");
                break;
            case 5:
                System.out.println("Estructuras de Control IF-ELSE");
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                System.out.println("Son Estructuras de  Control que permiten controlar el flujo del programa por dos caminos.");
                System.out.println("Si se cumple la condición ejecutará el bloque de código incluido entre sus llaves.");
                System.out.println("Se pueden colocar condiciones anidadas; si una no se cumple evaluará la siguiente hasta que alguna se cumpla.");
                System.out.println("-------------------------------------------------------------------------------------------------------------");
                System.out.println("Ejemplo IF/IF-ELSE seleccione una opción:");
                System.out.println("|  1) IF       |");
                //System.out.println("|      2) ELSE               5
                // |");
                System.out.println("|  2) IF ELSE  |");

                int Menu1 = Teclado.nextInt();
                switch (Menu1) {
                    case 1:
                        System.out.println("IF");
                        System.out.println("\n");
                        If.controlif();
                        break;
                    //case 2:
                        //System.out.println("ELSE");
                        //System.out.println("\n");
                        //break;
                    case 2:
                        System.out.println("IF ELSE");
                        System.out.println("\n");
                      IfElse.controlifelse();
                        break;
                }
                System.out.println("\n");
                break;
            case 6:
                System.out.println("Control Switch");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Switch en Java es una estructura de control que permite ejecutar diferentes bloques de código en función del valor de una variable.");
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Ejemplo Control Switch:");
                Switch.controlswitch();
                break;
            case 7:
                System.out.println("Operador Ternario");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("El operador Ternario en Java es una construcción que permite tomar decisiones basadas en una condición booleana en una sola línea de código.");
                System.out.println("Es una forma abreviada de expresar una estructura condicional (if-else). Este operador se compone de tres partes:");
                System.out.println("la condición a evaluar, el valor que se asigna si la condición es verdadera y el valor que se asigna si la condición es falsa.");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Ejemplo Operador Ternario:");
                Ternario.controlternario();
                break;
            case 8:
                System.out.println("Bucle Do While");
                System.out.println("---------------------------------------------------------------------------------------------------------");
                System.out.println("El Bucle Do While en Java se utiliza cuando se desea garantizar que el código se ejecute al menos una vez");
                System.out.println("independientemente de si se cumple la condición.");
                System.out.println("---------------------------------------------------------------------------------------------------------");
                System.out.println("Ejemplo Bucle Do While:");
                DoWhile.controldowhile();
                break;
            case 9:
                System.out.println("Bucle While");
                System.out.println("-------------------------------------------------------------------");
                System.out.println("El ciclo o bucle while en Java permite ejecutar un bloque de código");
                System.out.println("siempre y cuando una condición especificada sea verdadera.");
                System.out.println("-------------------------------------------------------------------");
                System.out.println("Ejemplo Bucle While:");
                While.controlwhile();
                break;
            case 10:
                System.out.println("Bucle For");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("El Bucle For en Java es una estructura de control de ciclo que se utiliza");
                System.out.println("para ejecutar un bloque de código una cantidad determinada de veces.");
                System.out.println("-------------------------------------------------------------------------");
                System.out.println("Ejemplo For:");
                For.controlfor();
                break;
            case 11:
                salir = true;
                System.out.println("Fuera del Sistema");
                System.out.println("\n");
                break;
            default:
                System.out.println("Regresar");
        }
    }
}


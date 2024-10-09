package programas;
/*public class If{
    public static void controlif() {

        int numero = 5;

        System.out.println("El Número es el siguiente:"+numero);
        if (numero > 0) {
            System.out.println("El número es positivo.");
        }
    }
}*/


public class If {
    public static void controlif() {
        System.out.println("Contando del 1 al 5");
        for (int numero = 1; numero <= 5;
             numero = numero + 1) {
            System.out.println("" + numero);
            if (numero > 0) {
                System.out.println("Los números son positivos.");
            }
        }
    }
}
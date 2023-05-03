package Paquete1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        // Crear objeto de tipo Scanner
        Scanner teclado = new Scanner(System.in);

        int num;
        System.out.println("Ingrese un numero: ");
        num = teclado.nextInt();
        System.out.println("El numero que ingresaste es: " + num);
    }
}

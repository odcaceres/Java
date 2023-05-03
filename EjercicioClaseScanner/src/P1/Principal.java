package P1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        byte edad;
        String nombre;
        double sueldo;

        // Creamos un objeto de tipo Scanner.
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        nombre = teclado.nextLine();

        System.out.println("Ingrese la edad: ");
        edad = teclado.nextByte();

        System.out.println("Ingrese el sueldo: ");
        sueldo = teclado.nextDouble();


        System.out.println("El nombre  es: " + nombre + " La edad es: "
                            + edad + " y el sueldo es " + sueldo);
    }
}

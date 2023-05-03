public class Primitivos {

    public static void main(String[] args) {
        /** Enteros */

        byte numero = 127;

        System.out.println("numero = " + numero);
        System.out.println("Cuantos BYTES tiene un Byte = " + Byte.BYTES );
        System.out.println("Cuantos BYTES tiene un Bytes = " + Byte.SIZE);
        System.out.println("Maximo valor del tipo de datos = " + Byte.MAX_VALUE);
        System.out.println("Minimo valor del tipo de datos = " + Byte.MIN_VALUE);
        System.out.println();
        short numShort = 3000;
        System.out.println("Cuantos BYTES tiene un Byte = " + Short.BYTES );
        System.out.println("Cuantos BYTES tiene un Bytes = " + Short.SIZE);
        System.out.println("Maximo valor del tipo de datos = " + Short.MAX_VALUE);
        System.out.println("Minimo valor del tipo de datos = " + Short.MIN_VALUE);
        System.out.println();

        /** Coma flotante */

        float numeroReal = 1.5e4f;
        float n = 15000;
        System.out.println("numeroReal = " + numeroReal);
        System.out.println("n = " + n);
        System.out.println("Cuantos BYTES tiene un Byte = " + Float.BYTES );
        System.out.println("Cuantos BYTES tiene un Bytes = " + Float.SIZE);
        System.out.println("Maximo valor del tipo de datos = " + Float.MAX_VALUE);
        System.out.println("Minimo valor del tipo de datos = " + Float.MIN_VALUE);

    }
}

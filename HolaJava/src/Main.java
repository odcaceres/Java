public class Main {
    public static void main(String[] args) {

        String mensaje = "Hola";
        Main m = new Main();
        m.Saludar(mensaje.toUpperCase());

        int numero = 10;
        Integer numero2 = 12;

        System.out.println("El numero de referencia es: " + numero2 + "\n" + "El numero es: " + numero);

        var nombre = "Gabriel";
        System.out.println(nombre);
    }

    public void Saludar(String mensaje) {
        System.out.println(mensaje);
    }
}
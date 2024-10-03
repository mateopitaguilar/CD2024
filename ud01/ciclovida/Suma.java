package ciclovida;

public class Suma {
    public static void main(String[] args) {

        // Convierte los argumentos de cadena a números
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);

        // Suma los dos números
        double suma = num1 + num2;

        // Imprime el resultado de la suma
        System.out.println("A suma dos dous números é: " + suma);
    }
}

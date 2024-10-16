public class Suma {
    public static void main(String[] args) {

        double num1, num2, num3, suma;

        // Inicialización de variables
        num1 = 0;
        num2 = 0;
        num3 = 0;
        suma = 0;

        try {
                    // Convierte los argumentos de cadena a números
        num1 = Double.parseDouble(args[0]);
        num2 = Double.parseDouble(args[1]);

        // Suma los dos números
        suma = num1 + num2;

        // En caso de que haya 3 argumentos los suma
        if(args.length == 3){
            num3 = Double.parseDouble(args[2]);
            suma = suma + num3;
        }

        // Imprime el resultado de la suma
        System.out.println("A suma dos dous números é: " + suma);

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

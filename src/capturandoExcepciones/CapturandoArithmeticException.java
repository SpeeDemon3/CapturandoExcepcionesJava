package capturandoExcepciones;

public class CapturandoArithmeticException {

    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Error en -> " + e.getMessage());
        }

        System.out.println("Fin del programa");
    }


}


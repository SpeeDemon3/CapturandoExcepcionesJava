package capturandoExcepciones;

public class CapturandoArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] numeros = new int[6];
        try {
            numeros[9] = 33;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error -> " + e.getLocalizedMessage());
        }
        System.out.println("Fin del programa.");
    }
}

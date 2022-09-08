package capturandoExcepciones;

import java.io.*;
import java.util.Scanner;


public class CapturandoFileNotFound {
    public static void main(String[] args) {
        
        try {
            File archivo = new File("/Users/x/archivo.txt");
            Scanner scanner = new Scanner(archivo);
            System.out.println("El archivo contiene: ");
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("End!!!");
    }
}

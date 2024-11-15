package dev.personal.java.numero.armstrong.view;

import java.util.Scanner;

import dev.personal.java.numero.armstrong.model.NumberAmrstrong;

public class MainView {

    Scanner scanner = new Scanner(System.in);

    public int getUserInput() {
        System.out.println("Ingrese un número: ");
        try {
            // Retorna el número ingresado
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.nextLine(); // Limpiar el buffer del scanner
            return -1;
        }
    }

    public void showResult(String result) {
        System.out.println(result);
    }

    public void closeScanner() {
        scanner.close();
    }

}

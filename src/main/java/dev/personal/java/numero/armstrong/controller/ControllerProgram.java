package dev.personal.java.numero.armstrong.controller;

import dev.personal.java.numero.armstrong.model.NumberAmrstrong;
import dev.personal.java.numero.armstrong.view.MainView;

public class ControllerProgram {

    public ControllerProgram(NumberAmrstrong model, MainView view) {
        this.model = model;
        this.view = view;
    } 

    private MainView view; // La vista
    private NumberAmrstrong model; // El modelo

    // Constructor del controlador
    public void NumberArmstrongController(MainView view, NumberAmrstrong model) {
        this.view = view;
        this.model = model;
    }

    // Método para iniciar el proceso
    public void start() {
        // Muestra la vista para que el usuario ingrese un número
        int userNumber = view.getUserInput();
        
        // Llama al modelo para verificar si el número es Armstrong
        String result = model.isArmstrong(userNumber);
        
        // Muestra el resultado en la vista
        view.showResult(result);
    }

    

}

package dev.personal.java.numero.armstrong;

import dev.personal.java.numero.armstrong.controller.ControllerProgram;
import dev.personal.java.numero.armstrong.model.NumberAmrstrong;
import dev.personal.java.numero.armstrong.view.MainView;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
       MainView mainView = new MainView(); 
       NumberAmrstrong model = new NumberAmrstrong();
       ControllerProgram controller = new ControllerProgram(model, mainView); 

       controller.start();

       mainView.closeScanner();
     
       
    }
}

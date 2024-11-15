package dev.personal.java.numero.armstrong.model;

import java.util.ArrayList;

public class NumberAmrstrong {

    int contador;
    
    public String isArmstrong(int numb) {
        int tempNumb = numb;

        ArrayList<Integer> digitos = new ArrayList<>();

        if (tempNumb == 0) {
            contador = 1;
        } else {
            while (tempNumb > 0) {
                int digito = tempNumb % 10;
                digitos.add(digito);
                tempNumb /= 10;
                contador++;
            }
        }

        int totalSum = 0; 

        for (Integer digito : digitos) {
           totalSum += (int) Math.pow(digito, contador);
        }

        if (numb == totalSum) {
            return "El numero es armstrong";
        } else {
            return "El numero no es Armstrong";
        }
    }
}

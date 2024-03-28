package org.experis.exercise;

public class SnackThree {
    public static void main(String[] args) {
        // Array di numeri
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // Variabile per la somma dei numeri in posizione dispari
        int sum = 0;
        // Ciclo per iterare attraverso gli elementi dell'array
        for (int i = 0; i < numbers.length ; i += 2) {
            // Aggiunge il numero in posizione dispari alla somma
            sum += numbers[i];
        }
        // Stampa la somma dei numeri in posizione dispari
        System.out.println("La somma dei numeri in posizione dispari è:" + sum);
    }
}

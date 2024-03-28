package org.experis.exercise;

import java.util.Random;

public class SnackTwo {
    public static void main(String[] args) {
        // Array di nomi e cognomi
        String[] names = {"Jay", "Daisy", "Tom", "Jordan", "Nick", "Myrtle", "George", "Meyer", "Lucille"};
        String[] surnames = {"Gatsby", "Buchanan", "Wilson", "Baker", "Fay", "McKee", "Carraway", "Wolfsheim"};
        // Creazione di un oggetto Random per generare numeri casuali
        Random random = new Random();
        // Stampa della lista dei falsi invitati
        System.out.println("Lista Falsi Invitati:");
        // Ciclo per generare 10 falsi invitati
        for (int i = 0; i < 10; i++) {
            // Genera un nome e un cognome casuali
            String name = names[random.nextInt(names.length)];
            String surname = surnames[random.nextInt(surnames.length)];
            // Stampa il nome e il cognome generati casualmente
            System.out.println(name + " " + surname);
        }
    }
}

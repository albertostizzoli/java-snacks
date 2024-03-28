package org.experis.exercise;

import java.util.Random;

public class SnackTwo {
    public static void main(String[] args) {
        String[] names = {"Jay", "Daisy", "Tom", "Jordan", "Nick", "Myrtle", "George", "Meyer", "Lucille"};
        String[] surnames = {"Gatsby", "Buchanan", "Wilson", "Baker", "Fay", "McKee", "Carraway", "Wolfsheim"};

        Random random = new Random();
        System.out.println("Lista Falsi Invitati:");
        for (int i = 0; i < 10; i++) {
            String name = names[random.nextInt(names.length)];
            String surname = surnames[random.nextInt(surnames.length)];
            System.out.println(name + " " + surname);
        }
    }
}

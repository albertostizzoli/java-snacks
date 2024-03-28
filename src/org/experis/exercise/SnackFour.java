package org.experis.exercise;

import java.util.Scanner;

public class SnackFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Richiesta all'utente di inserire una parola
        System.out.println("Inserisci una parola");
        // Legge l'input dell'utente e lo converte in minuscolo
        String word = scan.nextLine().toLowerCase();
        // Variabile per verificare se la parola è un palindromo
        boolean isPalindrome = true;

        // Ciclo per controllare se la parola è un palindromo
        for (int i = 0; i < word.length() / 2; i++) {
            // Confronta i caratteri simmetrici della parola
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                // Se i caratteri non corrispondono, la parola non è un palindromo
                isPalindrome = false;
                break;
            }
        }
        // Stampa se la parola è un palindromo o meno
        if (isPalindrome) {
            System.out.println("La parola è un palindromo");
        } else {
            System.out.println("La parola non è un palindromo");
        }

        scan.close();
    }
}



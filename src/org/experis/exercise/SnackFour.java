package org.experis.exercise;

import java.util.Scanner;

public class SnackFour {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Inserisci una parola");
        String word = scan.nextLine().toLowerCase();

        boolean isPalindrome = true;
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("La parola è un palindromo");
        } else {
            System.out.println("La parola non è un palindromo");
        }

        scan.close();
    }
}



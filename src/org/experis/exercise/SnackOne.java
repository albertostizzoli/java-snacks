package org.experis.exercise;

import java.util.Scanner;

public class SnackOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean numbers = false;
        // Ciclo che continua finché l'utente non inserisce un numero compreso tra 10 e 20
        while(!numbers){
            // Chiedo all'utente di inserire un numero
            System.out.println("Inserisci un numero tra 10 e 20: ");
            int number = scan.nextInt();
            // Verifico se il numero inserito è compreso tra 10 e 20
            if(number >= 10 && number <= 20) {
                // Se è compreso tra 10 e 20, setta la variabile numbers a true
                numbers = true;
                // Stampa "Giusto!!" se il numero è valido
                System.out.println("Giusto!!");
            }else{
                // Se il numero non è compreso tra 10 e 20, stampa un messaggio di errore e chiede di riprovare
                System.out.println("Numero non valido. Riprova");
            }
        }
        scan.close();
    }
}

package org.experis.exercise;

import java.util.Scanner;

public class SnackOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean numbers = false;

        while(!numbers){
            System.out.println("Inserisci un numero tra 10 e 20: ");
            int number = scan.nextInt();
            if(number >= 10 && number <= 20) {
                numbers = true;
                System.out.println("Giusto!!");
            }else{
                System.out.println("Numero non valido. Riprova");
            }
        }
        scan.close();
    }
}

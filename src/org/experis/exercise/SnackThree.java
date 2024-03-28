package org.experis.exercise;

public class SnackThree {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;

        for (int i = 0; i < numbers.length ; i += 2) {
            sum += numbers[i];
        }

        System.out.println("La somma dei numeri in posizione dispari è:" + sum);
    }
}

package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Userinput {

    public void testscores() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 15 test scores: ");
        float[] scores = new float[15];
        for (int i = 0; i < 15; i++) {
            int number = scan.nextInt();
            scores[i] = number;

        }
        Arrays.sort(scores);
        System.out.println("The third lowest score is: " + scores[2]);

    }

    public static void main(String[] args) {
    Userinput test = new Userinput();
    test.testscores();


    }
}

package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int i =0;
	int ticket;
	int answer;

        Random rnd = new Random();
        ticket = rnd.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Guess a number from 1 to 20 !");
        do {
            i++;
            System.out.println(" Enter a number: ");
            answer = scanner.nextInt();
            if (answer > ticket) {
                System.out.println(" Unfortunately you did not guess! My number is less. ");
            } else if (answer < ticket) {
                System.out.println(" Unfortunately you did not guess! My number is more. ");
            }
        }while(answer != ticket);
        System.out.println(" You guessed i the " +i+ "time" );

    }
}

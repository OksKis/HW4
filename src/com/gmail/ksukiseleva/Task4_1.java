package com.gmail.ksukiseleva;

import java.util.Scanner;

public class Task4_1 {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int a = sc.nextInt();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= a; j++) {
                if (j % 2 == 0) {
                    System.out.print("***");
                } else {System.out.print("+++");}
            }
            System.out.println();
        }
    }
}

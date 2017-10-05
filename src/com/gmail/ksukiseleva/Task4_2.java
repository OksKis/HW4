package com.gmail.ksukiseleva;

import java.util.Scanner;

public class Task4_2 {

    public static void main(String[] args) {
        // write your code here

        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        int a = sc.nextInt();

        int fact=1;
        if (a > 4 && a < 16) {
            while ( a > 0) {
                fact = fact * a;
                a--;
            }
            System.out.println(fact);

        } else {System.out.println("Wrong number");}

    }
}

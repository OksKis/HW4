package com.gmail.ksukiseleva;

import java.util.Scanner;

public class Task4_4 {

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Input rectangle sides: a and b");
    int a = sc.nextInt();
    int b = sc.nextInt();


        for (int i = 0; i<a; i++) {
            for (int j = 0; j<b; j++){
                if((j==0) || (j==b-1) || (i == 0) || (i == a-1)) {
                    System.out.print("*");
                } else {System.out.print(" ");}
            }
            System.out.println();
        }
    }
}

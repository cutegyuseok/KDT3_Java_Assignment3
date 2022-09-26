package me.day05.practice;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int a = A/100;
        int c = A%10;
        int b = (A%100)-c;
        int resultA = (c*100)+b+a;
        a = B/100;
        c = B%10;
        b = (B%100)-c;
        int resultB = (c*100)+b+a;
        if(resultB >resultA){
            System.out.println(resultB);
        }else if(resultA>resultB){
            System.out.println(resultA);
        }else {
            System.out.println(0);
        }
    }
}
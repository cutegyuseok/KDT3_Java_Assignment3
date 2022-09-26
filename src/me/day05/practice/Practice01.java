package me.day05.practice;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("메시지 입력 : ");
        String a = sc.nextLine();
       String[] b = a.split("\\s+");
       int n = b.length;
       for(int i = 0 ; i < n ; i ++){
           int m = b[i].length();
           String[] array_b = b[i].split("");
           System.out.print(array_b[0].toLowerCase());
           for (int l = 1; l <m ; l++){
               System.out.print(array_b[l].toUpperCase());
           }
           System.out.print(" ");
       }
    }
}

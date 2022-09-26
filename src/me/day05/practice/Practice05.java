package me.day05.practice;

import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        int p = 0;
        int y = 0;
        Scanner s = new Scanner(System.in);
        String[] a = s.next().split("");
        for (int i=0; i < a.length; i++) {
            String A = a[i].toLowerCase();
            if (A.equals("p")) {
                p++;
            }
            if (A.equals("y")) {
                y++;
            }
        }
        if (p == y ){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}

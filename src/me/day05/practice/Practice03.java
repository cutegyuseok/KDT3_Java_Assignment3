package me.day05.practice;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine().trim();
        if(S.isEmpty()){
            System.out.print(0);}
        else {
            String[] b = S.split("\\s+");
            int l = b.length;
            System.out.print(l);
        }
    }
}

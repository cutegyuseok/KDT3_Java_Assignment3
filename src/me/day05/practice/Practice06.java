package me.day05.practice;

public class Practice06 {
    public static void main(String[] args) {

        String answer = "";
        String phone_number = "01059101693";
        int n = phone_number.length();
        String A = phone_number.substring(n-4);
        for (int i=0; i<n-4;i++){
           answer +="*";
        }
        answer+=A;
        System.out.println(answer);
    }
}

package me.day05.practice;

public class Practice07 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: panama";
        String match = "[^0-9a-zA-Z]";
        boolean a;
        s = s.replaceAll(match, "").toLowerCase();
        int n = s.length();
        String b;
        String c;
        if(n%2 != 0) {
            b = s.substring(0, n / 2);
            c = s.substring((n / 2) + 1, n);
        }else {
            b = s.substring(0, n / 2);
            c = s.substring((n / 2), n);
        }
        StringBuffer sb = new StringBuffer(c);
        c = sb.reverse().toString();
        if (c.equals(b)){
            a = true;
            System.out.println(a);
        }else {
            a = false;
            System.out.println(a);
        }
    }

}

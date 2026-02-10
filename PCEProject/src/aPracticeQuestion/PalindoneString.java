package aPracticeQuestion;

import java.util.Scanner;

public class PalindoneString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String ");
        String str = scan.next();
        str = str.toLowerCase();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Original : "+ str);
        System.out.println("Reverse : " + rev);

        if (str.equals(rev))
        {	
            System.out.println("Palindrome");
        } else 
        {
            System.out.println("Not a Palindrome");
        }
    }
}

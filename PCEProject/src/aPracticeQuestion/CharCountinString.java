package aPracticeQuestion;

import java.util.Scanner;

public class CharCountinString {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = scan.next();
        int count = str.length();

        System.out.println("Total characters: " + count);
    }

}

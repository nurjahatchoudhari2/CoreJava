package aPracticeQuestion;

import java.util.Arrays;
import java.util.Scanner;

public class MissingnuminArray {
    public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);

         System.out.print("Enter array size: ");
         int n = sc.nextInt();

         int[] arr = new int[n];

         System.out.println("Enter array elements:");
         for (int i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
         }


        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                System.out.println("Missing number: " + (i + 1));
                break;
            }
        }
    }
}

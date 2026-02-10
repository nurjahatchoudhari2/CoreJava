package aPracticeQuestion;
public class HollowTriangle {
    public static void main(String[] args) {

        int n = 5;   // fixed number of rows

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                if (j == 1 || j == i || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

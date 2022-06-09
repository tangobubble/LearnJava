package patterns;

import java.util.Scanner;

public class pattern_14 {
    public static void main(String[] args) {
        System.out.println("Enter n value for pattern 14");

        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();
        int rows = 2 * n - 1;

        for (byte i = 1; i <= rows; i++) {
            if (i <= n) {
                for (byte j = 1; j <= rows - i + 1; j++) {
                    System.out.print("  ");
                }
                for (byte j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
                //System.out.println();
            }
            else{
                for (byte j = 1; j <= i; j++) {
                    System.out.print("  ");
                }
                for (byte j = 1; j <= rows - i + 1; j++) {
                    System.out.print("* ");
                }
                //System.out.println();
            }
            System.out.println();
        }
    }
}
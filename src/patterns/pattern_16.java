package patterns;

import java.util.Scanner;

public class pattern_16 {
    public static void main(String[] args){
        System.out.println("Enter n value for pattern 16");

        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();

        for (byte i = 1; i <= n-1; i++){
            System.out.print("  ");
        }
        System.out.print("* ");

        System.out.println();

        for(byte i = 2; i <= n-1; i++){
            for(byte j = 1; j <= n-i; j++) {
                System.out.print("  ");

            }
            System.out.print("* ");

            for(byte j = 1; j <= i-2; j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }

        for(byte i = 1; i <= n; i++){
            System.out.print("* ");
        }

    }
}

package patterns;

import java.util.Scanner;

public class pattern_15 {
    public static void main(String[] args){
        System.out.println("Enter n value of pattern 15");

        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();

        System.out.println("* ");

        for(byte i = 2; i <= n-1; i++){
            System.out.print("* ");

            for (byte j = 1; j <= i-2; j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            System.out.println();
        }

        for(byte j = 1; j <= n; j++){
            System.out.print("* ");
        }

    }
}

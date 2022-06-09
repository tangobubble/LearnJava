package patterns;

import java.util.Scanner;

public class pattern_18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();

        for(byte row = 1; row <= n; row++){
            for(byte col = row; col <= n; col++){
                System.out.print(" ");
            }
            for (byte col = 1; col <= row; col++){
                System.out.print("* ");
            }
            for(byte col = row; col <= n; col++){
                System.out.print("  ");
            }
            for(byte col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(byte row = 1; row <= n; row++){
            for(byte col = 1; col <= row; col++) {
                System.out.print("  ");
            }
            for(byte col = row; col <= n; col++){
                System.out.print("* ");
            }
            for(byte col = row; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

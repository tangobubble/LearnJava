package patterns;

import java.util.Scanner;

public class pattern_5 {
    public static void main(String[] args){
        System.out.println("Enter n value for pattern 5");

        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();

        for(byte i = 0; i <= n; i++){
            for(byte j = 0; j <= i; j++) {
                System.out.print("  ");
            }
            for(byte j = 1; j <= n-i; j++){
                System.out.print("* ");
            }
                System.out.println();
        }
    }
}

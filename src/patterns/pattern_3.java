package patterns;

import java.util.Scanner;

public class pattern_3 {
    public static void main(String[] args){
        System.out.println("Enter n value for pattern 3");
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();

        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

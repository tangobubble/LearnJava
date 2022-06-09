package patterns;

import java.util.Scanner;

public class pattern_1 {
    public static void main(String[] args){
        System.out.println("Enter n value");
        Scanner sc = new Scanner(System.in);
        byte n = sc.nextByte();

        for(byte i = 1; i <= n; i++)
        {
            for(byte j = 1; j <= i; j++)
            {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

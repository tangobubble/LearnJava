package nestedloops;

import java.util.Scanner;

public class DynamicTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte rows;
        byte columns;

        System.out.print("Enter x value: ");

        rows = sc.nextByte();

        System.out.print("Enter y value: ");

        columns = sc.nextByte();

        System.out.println("Tables " + rows + " x " + columns);

        for (int i = 1; i <= rows; i++) {
            System.out.print(" ");

            for (int j = 1; j <= columns; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}

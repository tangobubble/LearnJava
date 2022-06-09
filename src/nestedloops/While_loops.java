package nestedloops;

import java.util.Scanner;

public class While_loops {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        // To know the no of digits-  [log10(n) + 1;] is used
        int noOfDigits = (int)Math.log10(n) + 1;
        System.out.println(noOfDigits);

        // To find sum of all digits
        while (temp > 0){
            int lastDigit = temp % 10;
            temp /= 10;

            sum += lastDigit;
        }
        System.out.println("The sum of numbers of " + n + " is " + sum);
    }
}

package nestedloops;

public class Tables {

    public static void main(String[] args) {
        byte rows = 5;
        byte columns = 10;

        for (int i = 1; i <= rows; i++) {
            System.out.print(" ");

            for (int j = 1; j <= columns; j++) {
                System.out.print(" ");
                System.out.print(i * j);
            }
            System.out.println();
        }
    }
}

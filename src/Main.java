import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO

        int numar = scanner.nextInt();

        if (numar < 0) {
            System.out.println("empty");
        }

        for (int i = 0; i <= numar; i++) {
            switch (i % 4) {
                case 0:
                    System.out.print("+" + i + " ");
                    break;
                case 1:
                    System.out.print("*" + i + " ");
                    break;
                case 2:
                    System.out.print("~" + i + " ");
                    break;
                case 3:
                    System.out.print("-" + i + " ");
                    break;
            }
        }
        scanner.close();
    }
}
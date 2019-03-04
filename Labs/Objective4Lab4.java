import java.util.Scanner;

public class Objective4Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if((num % 2) > 0) {
            System.out.print("The number is odd");
        } else {
            System.out.print("The number is even");
        }

    }
}

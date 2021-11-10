import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value:");
        int number = scanner.nextInt();

        if (number % 2 !=0 ) {
            System.out.println("Odd number");
        } else {
            System.out.println("Even Number");
        }
        System.out.println("BYE");
    }
}

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value:");
        int number = scanner.nextInt();

        String result = (number % 2 !=0 ) ? "Odd number" : "Even Number";
        System.out.println(result);
    }
}

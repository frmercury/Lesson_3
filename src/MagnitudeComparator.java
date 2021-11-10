import java.util.Scanner;

public class MagnitudeComparator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();

        if (Math.abs(number1)>Math.abs(number2)){
            System.out.println("The number " + number1 + " has the greatest magnitude");
        }else {
            System.out.println("The number " + number2 + " has the greatest magnitude");
        }
    }
}
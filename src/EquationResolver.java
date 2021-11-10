import java.util.Scanner;

public class EquationResolver {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value:");
        double a = scanner.nextInt();
        System.out.println("Enter b value:");
        double b = scanner.nextInt();

        String result = a*b == 0 ? "Enter a value not equal to 0" : "x equals: " + String.valueOf((-1*b/a));
        System.out.println(result);
    }
}
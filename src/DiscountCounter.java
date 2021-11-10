import java.util.Scanner;

public class DiscountCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your purchase price:");
        double purchaseAmount = scanner.nextDouble();

        if (purchaseAmount > 1000) {
            System.out.println("Total price " + purchaseAmount*0.85 + "$");
        } else {
            System.out.println("You don't have a discount");
        }
    }
}
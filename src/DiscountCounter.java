import java.util.Scanner;

public class DiscountCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your purchase price:");
        double purchaseAmount = scanner.nextDouble();

        String result = purchaseAmount > 1000 ? "Total price " + String.valueOf(purchaseAmount*0.85) : "You don't have a discount";
        System.out.println(result);
    }
}

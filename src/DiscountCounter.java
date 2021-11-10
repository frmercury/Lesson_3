import java.util.Scanner;

public class DiscountCounter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your purchase amount:");
        double purchaseAmount = scanner.nextDouble();

        String result = purchaseAmount > 1000 ? String.valueOf(purchaseAmount*1.15) : "You don't have a discount";
        System.out.println(result);
    }
}

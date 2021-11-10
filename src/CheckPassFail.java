import java.util.Scanner;

public class CheckPassFail {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value:");
        int mark = scanner.nextInt();

        String result = (mark >= 50) ? "PASS" : "FAIL";
        System.out.println(result);
    }
}

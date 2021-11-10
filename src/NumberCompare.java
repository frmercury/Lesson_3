import java.util.Scanner;

public class NumberCompare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int number2 = scanner.nextInt();


//      Без проверки на равенство чисел
//      String result = number1 > number2 ? "The number" + number1 + "has the greatest value" : "The number" + number2 + "has the greatest value";

        String result = number1 > number2 ? "The number " + number1 + " has the greatest value" : number1 < number2 ? "The number " + number2 + " has the greatest value" : "They are even";
        System.out.println(result);

    }
}
import java.util.Scanner;

public class PrintNumberInWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value:");
        int number = scanner.nextInt();

        if (number == 1){
            System.out.println("ONE");
        }else if (number ==2){
            System.out.println("TWO");
        }
        else if (number ==3){
            System.out.println("THREE");
        }
        else if (number ==4){
            System.out.println("FOUR");
        }
        else if (number ==5){
            System.out.println("FIVE");
        }
        else if (number ==6){
            System.out.println("SIX");
        }
        else if (number ==7){
            System.out.println("SEVEN");
        }
        else if (number ==8){
            System.out.println("EIGHT");
        }
        else if (number ==9){
            System.out.println("NINE");
        }
        else {
            System.out.println("OTHER");
        }

        switch (number) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
        String result = (number == 1) ? "ONE" : (number == 2) ? "TWO" : (number == 3) ? "THREE" : (number == 4) ? "FOUR" : (number == 5) ? "FIVE" : (number == 6) ? "SIX" : (number == 7) ? "SEVEN" : "OTHER";
        System.out.println(result);
    }
}



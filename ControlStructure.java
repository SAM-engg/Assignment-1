import java.util.Scanner;
public class ControlStructure {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter a number: ");
        int number = input.nextInt();

       
        if (number % 2 == 0) {
            System.out.println("The number is Even.");
        } else {
            System.out.println("The number is Odd.");
        }

        
        if (number <= 1) {
            System.out.println("The number is not Prime.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("The number is Prime.");
            } else {
                System.out.println("The number is not Prime.");
            }
        }

        
        System.out.print("Enter a number (1 to 7) to get the weekday: ");
        int day = input.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid choice! Enter a number between 1 and 7.");
        }

        input.close();
    }
}
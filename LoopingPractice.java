import java.util.Scanner;

public class LoopingPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table: ");
        int tableNum = sc.nextInt();

        System.out.println("\nMultiplication Table of " + tableNum + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableNum + " x " + i + " = " + (tableNum * i));
        }


        System.out.print("\nEnter number of terms for Fibonacci series: ");
        int terms = sc.nextInt();

        System.out.println("Fibonacci Series:");
        int a = 0, b = 1, count = 0;
        while (count < terms) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
        System.out.println();


        System.out.print("\nEnter a number to check if it's an Armstrong number: ");
        int num = sc.nextInt();

        int original = num;
        int sum = 0;

        do {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        } while (num > 0);

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
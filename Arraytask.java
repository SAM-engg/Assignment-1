import java.util.Scanner;

public class Arraytask {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Array Assignment Menu ---");
            System.out.println("1. Input 10 integers and find Average, Max, Min");
            System.out.println("2. Create 3x3 Matrix and print Transpose");
            System.out.println("3. Bubble Sort and Binary Search");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    arrayStats();
                    break;
                case 2:
                    matrixTranspose();
                    break;
                case 3:
                    sortAndSearch();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);
    }

    public static void arrayStats() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum = 0, max, min;

        System.out.println("\nEnter 10 integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        max = min = numbers[0];
        for (int num : numbers) {
            if (num > max) max = num;
            if (num < min) min = num;
        }

        double average = sum / 10.0;
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }

    public static void matrixTranspose() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\nOriginal 3x3 Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose of Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void sortAndSearch() {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("\nEnter 10 integers:");
        for (int i = 0; i < 10; i++) {
            arr[i] = input.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Enter number to search: ");
        int key = input.nextInt();
        int low = 0, high = arr.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Number found at index: " + mid);
                found = true;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (!found) {
            System.out.println("Number not found.");
        }
    }
}